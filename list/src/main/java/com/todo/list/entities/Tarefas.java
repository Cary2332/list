package com.todo.list.entities;

import java.time.LocalDate;

import com.todo.list.entities.enums.Prioridade;
import com.todo.list.entities.enums.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity

@Table(name = "tb_tarefas")

public class Tarefas {

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	@Column(columnDefinition = "TEXT")
	private String descricao;
	private Status status;
	private String setor;
	private Prioridade prioridade;
	private LocalDate dataCadastro;

	public Tarefas() {

	}
 
 
	public Tarefas(Long id, String descricao, Status status, String setor,

			Prioridade prioridade, LocalDate dataCadastro) {

		this.id = id;
		this.descricao = descricao;
		this.status = status;
		this.setor = setor;
		this.prioridade = prioridade;
		this.dataCadastro = dataCadastro;

	}
 
	@ManyToOne
	@JoinColumn(name = "usuario_id") //junta uma tabela na outra, chave primária
	private Usuario usuario;

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
 
 
	public Status getStatus() {

		return status;

	}
 
 
	public void setStatus(Status status) {

		this.status = status;

	}
 
 
	public String getSetor() {

		return setor;

	}
 
 
	public void setSetor(String setor) {

		this.setor = setor;

	}
 
 
	public Prioridade getPrioridade() {

		return prioridade;

	}
 
 
	public void setPrioridade(Prioridade prioridade) {

		this.prioridade= prioridade;

	}
 
 
	public LocalDate getDataCadastro() {

		return dataCadastro;

	}
 
 
	public void setDataCadastro(LocalDate dataCadastro) {

		this.dataCadastro = dataCadastro;

	}
 
 
	public Usuario getUsuario() {

		return usuario;

	}
 
 
	public void setUsuario(Usuario usuario) {

		this.usuario = usuario;

	}
 
	

}

 