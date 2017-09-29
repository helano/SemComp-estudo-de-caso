package br.com.semComp.business;

import java.util.List;

import br.com.semComp.DAO.MinicursoDAO;
import br.com.semComp.model.Minicurso;

public class MInicursoRegras {

	private final MinicursoDAO minicursoDAO = new MinicursoDAO();
	

	
	public void salvar(Minicurso minicurso) {
		minicursoDAO.salvarMinicurso(minicurso);
		
	}

	
	public void alterar(Minicurso minicurso) {
		minicursoDAO.alterarMinicurso(minicurso);
		
	}


	public void excluir(Minicurso minicurso) {
		minicursoDAO.excluirMinicurso(minicurso);		
	}
	
	public List<Minicurso> buscarTodos(){
		return minicursoDAO.buscarTodosCursos();
	}
}
