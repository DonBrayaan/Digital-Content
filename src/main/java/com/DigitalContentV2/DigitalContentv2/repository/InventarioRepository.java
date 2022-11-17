package com.DigitalContentV2.DigitalContentv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DigitalContentV2.DigitalContentv2.modelo.Inventario;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Integer>{

}
