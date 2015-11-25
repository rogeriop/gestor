package br.com.arptec.gestor.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import br.com.arptec.gestor.dao.DAO;
import br.com.arptec.gestor.modelo.Funcao;
import br.com.arptec.gestor.modelo.Grupo;

@ManagedBean
@ViewScoped
public class GrupoBean {
	private Grupo grupo = new Grupo();
	private Funcao funcao = new Funcao();
	private Long id_grupo;
	private Long id_funcao;

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public void setId_funcao(Long id_funcao) {
		this.id_funcao = id_funcao;
	}

	public Long getId_grupo() {
		return id_grupo;
	}

	public void setId_grupo(Long id_grupo) {
		this.id_grupo = id_grupo;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void adicionaFuncao() {
		System.out.println("id_funcao " + id_funcao);
		Funcao funcao = new DAO<Funcao>(Funcao.class).buscaPorId(this.id_funcao);
		this.grupo.adicionaFuncoes(funcao);

	}

	public void setEliminaFuncao(Funcao funcao) {
//		this.funcao = new DAO<Funcao>(Funcao.class).buscaPorId(funcao.getId_funcao());
		this.grupo.elimiaFuncoes(funcao);
	}
	
	public Long getId_funcao() {
		return id_funcao;
	}

	public List<Grupo> getGrupos() {
		return new DAO(Grupo.class).listaTodos();
	}

	public List<Funcao> getFuncoesDoGrupo() {
		return this.grupo.getFuncoes();
	}

	public void gravar() {
		System.out.println("Gravando grupo " + this.grupo.getNome());
		if (this.grupo.getId_grupo() == null || this.grupo.getId_grupo() == 0) {
			new DAO<Grupo>(Grupo.class).adiciona(this.grupo);
		} else {
			new DAO<Grupo>(Grupo.class).atualiza(this.grupo);
		}
		this.grupo = new Grupo();
	}
	
	public void excluir() {
		this.grupo = new DAO<Grupo>(Grupo.class).buscaPorId(grupo.getId_grupo());
		new DAO<Grupo>(Grupo.class).remove(this.grupo);
		this.grupo = new Grupo();
	}
	
	public void setGrupoTabela(Grupo grupo) {
		this.grupo = new DAO<Grupo>(Grupo.class).buscaPorId(grupo.getId_grupo());
	}
}
