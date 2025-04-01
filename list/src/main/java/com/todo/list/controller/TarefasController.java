package com.todo.list.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.list.dto.TarefaDTO;
import com.todo.list.entities.Tarefas;
import com.todo.list.services.TarefaService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("tarefa")
@RestController
public class TarefasController {

	@Autowired
	TarefaService tarefaService;
	
	@PostMapping
	public ResponseEntity<TarefaDTO> criarTarefa(@Valid @RequestBody TarefaDTO dto){
		dto = tarefaService.salvarTarefa(dto);
		return ResponseEntity.ok(dto);
	}

	
	@GetMapping
	public ResponseEntity<List<Tarefas>> listarTarefas(){
		return ResponseEntity.ok(tarefaService.listarTarefas());
	}
}
	
	
	
	
	
	
	
	
	
	

