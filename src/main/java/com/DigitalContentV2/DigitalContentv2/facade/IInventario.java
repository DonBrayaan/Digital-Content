package com.DigitalContentV2.DigitalContentv2.facade;

import java.util.List;

import com.DigitalContentV2.DigitalContentv2.modelo.Inventario;

public interface IInventario {

	public List<Inventario> encontrarTodo();
	public void crear(Inventario inventario);
	public void actualizar(Inventario inventario);
	public void eliminar(Inventario inventario);
}
