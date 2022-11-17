package com.DigitalContentV2.DigitalContentv2.facadeImp;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.DigitalContentV2.DigitalContentv2.facade.IUsuario;
import com.DigitalContentV2.DigitalContentv2.modelo.Rol;
import com.DigitalContentV2.DigitalContentv2.modelo.Usuario;
import com.DigitalContentV2.DigitalContentv2.repository.UsuarioRepository;
import com.DigitalContentV2.DigitalContentv2.sesiones.UsuarioRegistroS;

@Service
public class Usuariodao implements IUsuario {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public List<Usuario> encontrarTodo() {
		return this.usuarioRepository.findAll();
	}

	@Override
	public Usuario encontrarId(Integer idUsuario) {
		return this.usuarioRepository.getReferenceById(idUsuario);
	}

	@Override
	public void crear(Usuario usuario) {
		usuario.setEstado("Activo");
		this.usuarioRepository.save(usuario);
	}

	@Override
	public void actualizar(Usuario usuario) {
		this.usuarioRepository.save(usuario);
		
	}

	@Override
	public void eliminar(Usuario usuario) {
		this.usuarioRepository.save(usuario);
	}

	@Override
	public Usuario save(UsuarioRegistroS uregistroS) {
		Usuario usuario = new Usuario(uregistroS.getNombres(), 
		uregistroS.getApellidos(), uregistroS.getTipoDocumento(), 
		uregistroS.getNumDocumento(), uregistroS.getDireccion(), 
		uregistroS.getId_Barrio_fk(), uregistroS.getTelefono(), 
		passwordEncoder.encode(uregistroS.getContrasena()), 
		uregistroS.getCorreo(), Arrays.asList(new Rol("Cliente")));
		usuario.setEstado("Activo");
		return this.usuarioRepository.save(usuario);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.findByCorreo(username);
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuario o Clave inválidos");
		}
		return new User(usuario.getCorreo(), usuario.getContrasena(), mapearAutoridadesRoles(usuario.getRoles()));
	}
	
	private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Rol> roles){
		return roles.stream().map(rol -> new SimpleGrantedAuthority(rol.getNombre())).collect(Collectors.toList());
		
	}
 
}
