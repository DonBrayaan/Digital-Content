package com.DigitalContentV2.DigitalContentv2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.DigitalContentV2.DigitalContentv2.facadeImp.Barriodao;
import com.DigitalContentV2.DigitalContentv2.facadeImp.Usuariodao;
import com.DigitalContentV2.DigitalContentv2.modelo.Barrio;
import com.DigitalContentV2.DigitalContentv2.sesiones.UsuarioRegistroS;

@Controller
@RequestMapping("/registro")
public class UsuarioController {
	
	@Autowired
	private Usuariodao usuarioDao;
	
	@Autowired
	private Barriodao barrioDao;
	
	@ModelAttribute("usuario")
	private UsuarioRegistroS retornarNuevoUsuario() {
		return new UsuarioRegistroS();
	}
	
	@GetMapping
	public String mostrarFormulario(Model modelo) {
		List<Barrio> lstBar = this.barrioDao.encontrarTodo();
		modelo.addAttribute("barrio", lstBar);
		return "Ausuario/formulario_cu";
	}
	
	@PostMapping
	public String registrarCunteaUsuario(@ModelAttribute("usuario") UsuarioRegistroS registroS) {
		usuarioDao.save(registroS);
		return "redirect:/registro?exito";
	}
	
}
