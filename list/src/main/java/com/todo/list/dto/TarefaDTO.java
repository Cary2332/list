package com.todo.list.dto;

import java.time.LocalDate;

import com.todo.list.entities.Tarefas;
import com.todo.list.entities.Usuario;
import com.todo.list.entities.enums.Prioridade;
import com.todo.list.entities.enums.Status;

public class TarefaDTO {
	
	private Long id;
	private String descricao;
	private String setor;
	private Status status;
	private LocalDate dataCadastro;
	private Prioridade prioridade;
	private Long IdUsuario;
	
	public TarefaDTO() {
		
	}

	
	public TarefaDTO(Long id, String descricao, String setor, Status status, LocalDate dataCadastro,
			Prioridade prioridade, Long idUsuario) {
	
		this.id = id;
		this.descricao = descricao;
		this.setor = setor;
		this.status = status;
		this.dataCadastro = dataCadastro;
		this.prioridade = prioridade;
	 this.IdUsuario = idUsuario;
	}


	

	public TarefaDTO(Tarefas entity) {

	    id = entity.getId();
	    descricao = entity.getDescricao();
		setor = entity.getSetor();
		status = entity.getStatus();
		dataCadastro = entity.getDataCadastro();
		prioridade = entity.getPrioridade();
		IdUsuario = entity.getUsuario().getId();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getSetor() {
		return setor;
	}


	public void setSetor(String setor) {
		this.setor = setor;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public LocalDate getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}


	public Prioridade getPrioridade() {
		return prioridade;
	}


	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}


	public Long getIdUsuario() {
		return IdUsuario;
	}


	public void setIdUsuario(Long idUsuario) {
		IdUsuario = idUsuario;
	}
	
 
}