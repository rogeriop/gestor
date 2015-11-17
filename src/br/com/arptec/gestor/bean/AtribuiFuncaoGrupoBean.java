package br.com.arptec.gestor.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.arptec.gestor.dao.DAO;
import br.com.arptec.gestor.modelo.Funcao;
import br.com.arptec.gestor.modelo.Grupo;

@ManagedBean
public class AtribuiFuncaoGrupoBean {

	private Grupo grupo = new Grupo();
	private Funcao funcao = new Funcao();
	
	private Long id_grupo;
	private Long id_funcao;
	
	public Long getId_grupo() {
		return id_grupo;
	}

	public void setId_grupo(Long id_grupo) {
		this.id_grupo = id_grupo;
	}

	public Long getId_funcao() {
		return id_funcao;
	}

	public void setId_funcao(Long id_funcao) {
		this.id_funcao = id_funcao;
	}

	public List<Grupo> getGrupos() {
		return new DAO<Grupo>(Grupo.class).listaTodos();
	}

	public List<Funcao> getFuncoes() {
		return new DAO<Funcao>(Funcao.class).listaTodos();
	}

	public void gravar() {
//		System.out.println("Gravando usuario " + this.usuario.getNome());

//		usuario.setGrupo(new DAO<Grupo>(Grupo.class).buscaPorId(id_grupo));

//		new DAO<Usuario>(Usuario.class).adiciona(this.usuario);
	}

	
}
