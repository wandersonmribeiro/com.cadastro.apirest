package com.cadastro.apirest.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TB_PESSOA")
public class Pessoa  implements Serializable{

	private static final long serialVersionUID = 3253215801224243862L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	@NotNull
	private String nome;

	public long getCodigo() {
		return id;
	}

	public void setCodigo(long codigo) {
		this.id = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa() {
		
		this.id = id;
		this.nome = nome;
	}	
}
