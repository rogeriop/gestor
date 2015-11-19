package br.com.arptec.gestor.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="grupo")
public class Grupo {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_grupo;
	private String nome;

	@OneToMany(mappedBy="grupo")
	private List<Usuario> usuarios;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)
	@JoinTable(
			name="grupo_funcao",
			joinColumns = @JoinColumn(name="id_grupo"), inverseJoinColumns = @JoinColumn(name = "id_funcao"))
	private List<Funcao> funcoes;


	public Grupo() {
		super();
	}

	public void setId_grupo(Long id_grupo) {
		this.id_grupo = id_grupo;
	}
	
	public Long getId_grupo() {
		return id_grupo;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public List<Funcao> getFuncoes() {
		return funcoes;
	}
	
	public void setFuncoes(List<Funcao> funcoes) {
		this.funcoes = funcoes;
		
	}
	
}
