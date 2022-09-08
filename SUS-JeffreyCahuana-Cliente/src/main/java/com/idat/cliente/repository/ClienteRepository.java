package com.idat.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.cliente.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
