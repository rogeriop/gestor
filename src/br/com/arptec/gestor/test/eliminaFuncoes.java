package br.com.arptec.gestor.test;

import java.util.List;

import org.junit.Test;

import br.com.arptec.gestor.bean.GrupoBean;
import br.com.arptec.gestor.dao.DAO;
import br.com.arptec.gestor.modelo.Funcao;
import br.com.arptec.gestor.modelo.Grupo;


public class eliminaFuncoes {

	@Test
	public void test() {
		
		GrupoBean grupoBean = new GrupoBean();

		Grupo grupo = new DAO<Grupo>(Grupo.class).buscaPorId(17L);
		grupoBean.setGrupo(grupo);

		List<Funcao> funcoes = grupoBean.getFuncoesDoGrupo();
		
		funcao = 
		Funcao funcao = new Funcao();
		funcao = new DAO<Funcao>(Funcao.class).buscaPorId(2L);
		
		grupo.getFuncoes().remove(funcao);
		
		grupo.g
		
		
	}
}
