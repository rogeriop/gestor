package br.com.arptec.gestor.util;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.arptec.gestor.modelo.Funcao;
import br.com.arptec.gestor.modelo.Grupo;
import br.com.arptec.gestor.modelo.Usuario;

public class PopulaBanco {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();

		manager.getTransaction().begin();

		// Cadastro de Grupo
		Grupo teste = new Grupo();
		Grupo administrador = new Grupo();

		administrador.setNome("ADMINISTRADOR");
		teste.setNome("TESTE");

		manager.persist(administrador);
		manager.persist(teste);
		
		// Cadastro de Função
		Funcao funcao1 = new Funcao();
		Funcao funcao2 = new Funcao();
		Funcao funcao3 = new Funcao();
		Funcao funcao4 = new Funcao();

		funcao1.setNome("Cadastro de Usuario");
		funcao2.setNome("Cadastro de Grupo");
		funcao3.setNome("Cadastro de Funcao");
		funcao4.setNome("Atribui Funcao a Grupo");
		
		manager.persist(funcao1);
		manager.persist(funcao2);
		manager.persist(funcao3);
		manager.persist(funcao4);

		// Cadastro de Usuários
		Usuario usuario1 = new Usuario("Antônio Rogério Pinheiro", "rogeriop@arptec.com.br", "12345678", teste);
		Usuario usuario2 = new Usuario("Rogério Ramos Pinheiro", "rogeriopxpinheiro@gmail.com", "12345678", teste);
		Usuario usuario3 = new Usuario("Filipe Ramos Pinheiro", "filipe@gmail.com", "12345678", administrador);
		Usuario usuario4 = new Usuario("Newton Filipe Cabral Pinheiro", "newton@gmail.com", "12345678", administrador);

		manager.persist(usuario1);
		manager.persist(usuario2);
		manager.persist(usuario3);
		manager.persist(usuario4);
		
		// Atribui Funcão a Grupo
		List<Funcao> funcoesAdministrador = Arrays.asList(funcao1, funcao2, funcao3, funcao4);
		administrador.setFuncoes(funcoesAdministrador);
		manager.persist(administrador);
		
		List<Funcao> funcoesTeste = Arrays.asList(funcao1, funcao2);
		teste.setFuncoes(funcoesTeste);
		manager.persist(teste);

		manager.getTransaction().commit();

		manager.close();

	}


}
