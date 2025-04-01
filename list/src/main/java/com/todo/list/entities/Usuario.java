package com.todo.list.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity //identifica uma entidade
@Table(name = "tb_usuario")// identifica um nome de uma tabela
public class Usuario {

	  @Id //ele oferece um valor
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  private String nome;
	  @Column (unique = true)//definir apenas uma validacao
	  private String email;
	 

	  @OneToMany(mappedBy = "usuario")
	  private List<Tarefas> tarefas;
	  
	  
	public Usuario() {
		
	}

	public Usuario(Long id, String nome, String email) {
		
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	public Long getId() { //trazer ou mostrar 
		return id;
	}

	public void setId(Long id) { //modificar um atributo
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) { 
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Tarefas> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefas> tarefas) {
		this.tarefas = tarefas;
	}

}