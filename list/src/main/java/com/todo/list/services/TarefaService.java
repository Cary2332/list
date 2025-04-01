package com.todo.list.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.todo.list.dto.TarefaDTO;
import com.todo.list.entities.Tarefas;
import com.todo.list.entities.Usuario;
import com.todo.list.entities.enums.Prioridade;
import com.todo.list.entities.enums.Status;
import com.todo.list.repositories.TarefaRepository;
import com.todo.list.repositories.UsuarioRepository;

public class TarefaService {

	@Autowired
	TarefaRepository tarefaRepository;
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public TarefaDTO salvarTarefa(TarefaDTO dto) {
		
		Tarefas task = new Tarefas();	
		

		task.setDescricao(dto.getDescricao());
		task.setSetor(dto.getSetor());
		task.setPrioridade(Prioridade.BAIXA);
		task.setDataCadastro(LocalDate.now());
		task.setStatus(Status.A_FAZER);
		
		Usuario user = usuarioRepository.getReferenceById(dto.getId());
		
		task.setUsuario(user);
		
		task = tarefaRepository.save(task);
		
		
		return null;
	}
	public List<Tarefas> listarTarefas(){

	List<Tarefas> tarefas = tarefaRepository.findAll();
		return tarefas;
	
       }
	
}
