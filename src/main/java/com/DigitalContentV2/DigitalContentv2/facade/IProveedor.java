package com.DigitalContentV2.DigitalContentv2.facade;

import java.util.List;

import com.DigitalContentV2.DigitalContentv2.modelo.Proveedor;

public interface IProveedor {

	public List<Proveedor> encontrarTodo();
	public void crear(Proveedor proveedor);
	public void actualizar(Proveedor proveedor);
	public void eliminar(Proveedor proveedor);
}
