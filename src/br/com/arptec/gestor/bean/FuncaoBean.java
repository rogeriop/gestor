package br.com.arptec.gestor.bean;

import javax.faces.bean.ManagedBean;

import br.com.arptec.gestor.dao.DAO;
import br.com.arptec.gestor.modelo.Funcao;

@ManagedBean
public class FuncaoBean {
	private Funcao funcao = new Funcao();

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	public void gravar() {
		System.out.println("Gravando funcao " + this.funcao.getNome());
		new DAO<Funcao>(Funcao.class).adiciona(this.funcao);
	}
}
