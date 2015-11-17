package br.com.arptec.gestor.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.arptec.gestor.dao.DAO;
import br.com.arptec.gestor.modelo.Grupo;
import br.com.arptec.gestor.modelo.Usuario;

@ManagedBean
public class AtribuiBean {

	private Usuario usuario = new Usuario();
	private Long id_grupo;

	public Long getId_grupo() {
		return id_grupo;
	}

	public void setId_grupo(Long id_grupo) {
		this.id_grupo = id_grupo;
		Grupo grupo = new DAO<Grupo>(Grupo.class).buscaPorId(this.id_grupo);
		this.usuario.setGrupo(grupo);
		System.out.println("Escrito por: " + grupo.getNome());
	}

	public Usuario getUsuario() {
		return usuario;
	}
	
	public List<Grupo> getGrupos() {
		return new DAO<Grupo>(Grupo.class).listaTodos();
	}
	
	
	
/** 	
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
	
*/	
}
