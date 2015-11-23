package br.com.arptec.gestor.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.arptec.gestor.dao.DAO;
import br.com.arptec.gestor.modelo.Funcao;

@ManagedBean

public class FuncaoBean {
	private Funcao funcao = new Funcao();
	private Long id_funcao;

	public Long getId_funcao() {
		return id_funcao;
	}

	public void setId_funcao(Long id_funcao) {
		this.id_funcao = id_funcao;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	public List<Funcao> getFuncoes() {
		return new DAO(Funcao.class).listaTodos();
	}
	
	public void gravar() {
		System.out.println("Gravando funcao " + this.funcao.getNome());
		new DAO<Funcao>(Funcao.class).adiciona(this.funcao);
	}
}
