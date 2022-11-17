package com.DigitalContentV2.DigitalContentv2.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "proveedor")
public class Proveedor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProveedor;
	
	@Column(name = "nombres", nullable = false, length = 70)
	private String nombres;
	
	@Column(name = "apellidos", nullable = false, length = 70)
	private String apellidos;
	
	@Column(name = "tipoProducto", nullable = false, length = 50)
	private String tipoProducto;
	
	@Column(name = "direccion", nullable = false, length = 100)
	private String direccion;
	
	@Column(name = "Celular", nullable = false, length = 16)
	private String celular;
	
	@Column(name = "estado", nullable = false, length = 30)
	private String estado;
	
	@ManyToMany(mappedBy = "proveedor")
	private List<Compra> compra = new ArrayList<Compra>();
}
