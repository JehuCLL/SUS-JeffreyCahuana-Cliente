package com.idat.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.idat.cliente.model.Usuario;


@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer>{
	
	Usuario findByUsuario(String usuario);

}
