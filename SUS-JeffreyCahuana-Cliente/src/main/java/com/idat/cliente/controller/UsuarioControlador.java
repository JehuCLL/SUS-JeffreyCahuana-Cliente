package com.idat.cliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.idat.cliente.segurity.JwtUtil;
import com.idat.cliente.segurity.UserDetailService;

@RestController
public class UsuarioControlador {
	
	@Autowired
	private JwtUtil util;

	@Autowired
	private UserDetailService service;
	
}
