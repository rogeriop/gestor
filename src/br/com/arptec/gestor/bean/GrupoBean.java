package br.com.arptec.gestor.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.arptec.gestor.dao.DAO;
import br.com.arptec.gestor.modelo.Grupo;

@ManagedBean
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
		return new DAO(Grupo.class).listaTodos();
	}
	
	public void gravarFuncoes() {
		
	}
	
	public void gravar() {
		System.out.println("Gravando grupo " + this.grupo.getNome());
		new DAO<Grupo>(Grupo.class).adiciona(this.grupo);
	}

}
