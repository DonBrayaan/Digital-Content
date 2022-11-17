package com.DigitalContentV2.DigitalContentv2.facade;

import java.util.List;

import com.DigitalContentV2.DigitalContentv2.modelo.Genero;

public interface IGenero {

	public List<Genero> encontrarTodo();
	public Genero encontrarId(Integer idGenero);
	public void crear(Genero genero);
	public void actualizar(Genero genero);
	public void eliminar(Genero genero);
}
