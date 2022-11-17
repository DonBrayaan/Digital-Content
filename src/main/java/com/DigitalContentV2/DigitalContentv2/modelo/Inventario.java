package com.DigitalContentV2.DigitalContentv2.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "inventario")
public class Inventario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idInventario;
	
	@ManyToOne
	@JoinColumn(name = "id_Producto_fk")
	private Producto id_Producto_fk;
	
	@ManyToOne
	@JoinColumn(name = "id_Compra_fk")
	private Compra id_Compra_fk;
	
	@ManyToOne
	@JoinColumn(name = "id_Venta_fk")
	private Venta id_Venta_fk;
	
	@Column(name = "stock", nullable = false)
	private Integer stock;
	
	@ManyToOne
	@JoinColumn(name = "id_Devolucion_fk")
	private Devolucion id_Devolucion_fk;
	
}
