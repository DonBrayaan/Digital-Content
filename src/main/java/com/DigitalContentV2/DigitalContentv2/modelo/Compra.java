package com.DigitalContentV2.DigitalContentv2.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "compra")
public class Compra implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCompra;
	
	@Column(name = "fecha", updatable = false, nullable = false)
	@Temporal(TemporalType.DATE)
	private Calendar fecha; 
	
	@Column(name = "producto", nullable = false, length = 70)
	private String productoc;
	
	@Column(name = "cantidad", nullable = false, length = 10)
	private Integer cantidad;
	
	@Column(name = "precioT", nullable = false, length = 30)
	private float precioT;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "detalle_compra", joinColumns = @JoinColumn(name = "id_Compra_fk"), inverseJoinColumns = @JoinColumn(name = "id_Proveedor_fk"))
	private List<Proveedor> proveedor = new ArrayList<Proveedor>();
	
	@OneToMany(mappedBy = "id_Compra_fk")
	private List<Inventario> inventario;
}
