package com.DigitalContentV2.DigitalContentv2.sesiones;

import com.DigitalContentV2.DigitalContentv2.modelo.Barrio;

public class UsuarioRegistroS {

	private Integer idUsuario;
	private String nombres;
	private String apellidos;
	private String tipoDocumento;
	private Integer numDocumento;
	private String direccion;
	private Barrio id_Barrio_fk;
	private Integer telefono;
	private String estado;
	private String contrasena;
	private String correo;

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Integer getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(Integer numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Barrio getId_Barrio_fk() {
		return id_Barrio_fk;
	}

	public void setId_Barrio_fk(Barrio id_Barrio_fk) {
		this.id_Barrio_fk = id_Barrio_fk;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public UsuarioRegistroS(Integer idUsuario, String nombres, String apellidos, String tipoDocumento,
			Integer numDocumento, String direccion, Barrio id_Barrio_fk, Integer telefono, String estado,
			String contrasena, String correo) {
		super();
		this.idUsuario = idUsuario;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.tipoDocumento = tipoDocumento;
		this.numDocumento = numDocumento;
		this.direccion = direccion;
		this.id_Barrio_fk = id_Barrio_fk;
		this.telefono = telefono;
		this.estado = estado;
		this.contrasena = contrasena;
		this.correo = correo;
	}

	public UsuarioRegistroS(String nombres, String apellidos, String tipoDocumento, Integer numDocumento,
			String direccion, Barrio id_Barrio_fk, Integer telefono, String contrasena, String correo) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.tipoDocumento = tipoDocumento;
		this.numDocumento = numDocumento;
		this.direccion = direccion;
		this.id_Barrio_fk = id_Barrio_fk;
		this.telefono = telefono;
		this.contrasena = contrasena;
		this.correo = correo;
	}

	public UsuarioRegistroS(String correo) {
		super();
		this.correo = correo;
	}

	public UsuarioRegistroS() {

	}

}
