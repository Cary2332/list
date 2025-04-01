package com.todo.list.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.list.dto.UsuarioDTO;
import com.todo.list.services.UsuarioService;

@Controller
@RequestMapping("/usuario")
@RestController
public class UsuarioController {
 
	@Autowired
	UsuarioService usuarioService;
	
	@PostMapping
	public ResponseEntity<UsuarioDTO> salvar(@RequestBody UsuarioDTO dto) {
		dto = usuarioService.salvar(dto);
		return ResponseEntity.ok(dto);
	}
	
}
 