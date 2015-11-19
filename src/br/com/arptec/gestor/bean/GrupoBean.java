package br.com.arptec.gestor.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.arptec.gestor.dao.DAO;
import br.com.arptec.gestor.modelo.Funcao;
import br.com.arptec.gestor.modelo.Grupo;

@ManagedBean
@SessionScoped
public class GrupoBean {
	private Grupo grupo = new Grupo();
	private Long id_grupo;
	
	public Long getId_grupo() {
		return id_grupo;
	}

	public void setId_grupo(Long id_grupo) {
		this.id_grupo = id_grupo;
	}

	public Grupo getGrupo() {
		return grupo;
	}
	
	public List<Grupo> getGrupos() {
		if (this.id_grupo == null) {
		this.id_grupo = 1L;}
		System.out.println("Mexeu 1");
		return new DAO(Grupo.class).listaTodos();
	}

	public List<Funcao> getFuncoesDoGrupo() {
		this.grupo = (Grupo) new DAO(Grupo.class).buscaPorId(id_grupo);
		System.out.println("Passei 1");
		
		for (Funcao funcao: this.grupo.getFuncoes()) {
			System.out.println(funcao.getNome());
		}
		System.out.println("Passei 2");

		return this.grupo.getFuncoes();
				
	}
	
	public void gravarFuncoes() {
		
	}
	
	public void gravar() {
		System.out.println("Gravando grupo " + this.grupo.getNome());
		new DAO<Grupo>(Grupo.class).adiciona(this.grupo);
	}

}
