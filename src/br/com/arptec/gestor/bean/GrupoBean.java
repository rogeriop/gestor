package br.com.arptec.gestor.bean;

import javax.faces.bean.ManagedBean;

import br.com.arptec.gestor.dao.DAO;
import br.com.arptec.gestor.modelo.Grupo;

@ManagedBean
public class GrupoBean {
	private Grupo grupo = new Grupo();
	
	public Grupo getGrupo() {
		return grupo;
	}
	
	public void gravar() {
		System.out.println("Gravando grupo " + this.grupo.getNome());

		new DAO<Grupo>(Grupo.class).adiciona(this.grupo);
	}

}
