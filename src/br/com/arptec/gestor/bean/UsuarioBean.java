package br.com.arptec.gestor.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.arptec.gestor.dao.DAO;
import br.com.arptec.gestor.modelo.Grupo;
import br.com.arptec.gestor.modelo.Usuario;

@ManagedBean
public class UsuarioBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private Usuario usuario = new Usuario();
	private Long id_grupo;

	public Long getId_grupo() {
		return id_grupo;
	}

	public void setId_grupo(Long id_grupo) {
		this.id_grupo = id_grupo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	
	public List<Grupo> getGrupos() {
		return new DAO<Grupo>(Grupo.class).listaTodos();
	}
	
	public void gravar() {
		System.out.println("Gravando usuario " + this.usuario.getNome());

		usuario.setGrupo(new DAO<Grupo>(Grupo.class).buscaPorId(id_grupo));

		new DAO<Usuario>(Usuario.class).adiciona(this.usuario);
	}

	
}
