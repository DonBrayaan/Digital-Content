package com.DigitalContentV2.DigitalContentv2.facade;

import java.util.List;

import com.DigitalContentV2.DigitalContentv2.modelo.Talla;

public interface ITalla {

	public List<Talla> encontrarTodo();
	public Talla encontrarId(Integer idTalla);
	public void crear(Talla talla);
	public void actualizar(Talla talla);
	public void eliminar(Talla talla);
}
