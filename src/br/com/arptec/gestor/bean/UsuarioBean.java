package br.com.arptec.gestor.bean;

import javax.faces.bean.ManagedBean;

import br.com.arptec.gestor.dao.DAO;
import br.com.arptec.gestor.modelo.Usuario;

@ManagedBean
public class UsuarioBean {

	private Usuario usuario = new Usuario();

	public Usuario getUsuario() {
		return usuario;
	}
	
	public void gravar() {
		System.out.println("Gravando usuario " + this.usuario.getNome());

		new DAO<Usuario>(Usuario.class).adiciona(this.usuario);
	}

	
}
