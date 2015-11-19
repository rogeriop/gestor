package br.com.arptec.gestor.test;

import java.util.List;

import org.junit.Test;

import br.com.arptec.gestor.bean.GrupoBean;
import br.com.arptec.gestor.modelo.Funcao;

public class atribuiFuncaoGrupoTest {

	@Test
	public void test() {

		GrupoBean grupoBean = new GrupoBean();
		
		grupoBean.setId_grupo(1L);
		
		List<Funcao> funcoes = grupoBean.getFuncoesDoGrupo();
		
		for (Funcao funcao: funcoes) {
			System.out.println(funcao.getNome());
		}
			
		
	}

}
