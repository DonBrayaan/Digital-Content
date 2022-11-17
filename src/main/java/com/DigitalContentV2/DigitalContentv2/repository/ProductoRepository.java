package com.DigitalContentV2.DigitalContentv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DigitalContentV2.DigitalContentv2.modelo.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
