package br.com.arptec.gestor.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcao {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_funcao;
	private String nome;

	public Funcao() {
	}

	public Long getId_funcao() {
		return id_funcao;
	}

	public void setId_funcao(Long id_funcao) {
		this.id_funcao = id_funcao;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


}
