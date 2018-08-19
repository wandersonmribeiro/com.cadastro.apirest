package com.cadastro.apirest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TB_USUARIO")
public class Usuario extends Pessoa {

	private static final long serialVersionUID = 7502279493649808754L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	@NotNull
	private String nomeUsuario;
	@NotNull
	private String senhaUsuario;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	@Override
	public long getCodigo() {
		// TODO Auto-generated method stub
		return super.getCodigo();
	}
	@Override
	public void setCodigo(long codigo) {
		// TODO Auto-generated method stub
		super.setCodigo(codigo);
	}
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}
	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}
	public Usuario() {
		super();
		
		// TODO Auto-generated constructor stub
	}
	
	
}
