package br.com.semComp.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import br.com.semComp.business.MInicursoRegras;
import br.com.semComp.model.Minicurso;

@ManagedBean(name="minicursoBean")
@ViewScoped
public class MinicursoBean {

	private final MInicursoRegras mInicursoRegras;
	private Minicurso minicurso;
	private Minicurso minicursoEditar;
	private Minicurso minicursoExcluir;
	private List<Minicurso> minicursos;
	
	
	public MinicursoBean() {
		minicurso = new Minicurso();
		mInicursoRegras = new MInicursoRegras();
		minicursos = mInicursoRegras.buscarTodos();
	}


	
	
	public void salvarMinicurso(){
		
		if (minicurso != null) {
			mInicursoRegras.salvar(minicurso);
			minicurso = new Minicurso();
		} else {
			System.out.println("Erro");
		}
		
	}
	
	public void editarMinicurso(){
		
		mInicursoRegras.alterar(minicursoEditar);
		
	}
	
	public void excluirMinicurso(){
		mInicursoRegras.excluir(minicursoExcluir);
		minicursos = mInicursoRegras.buscarTodos();
		
		
	}
	
	
	
	
	public Minicurso getMinicurso() {
		return minicurso;
	}


	public void setMinicurso(Minicurso minicurso) {
		this.minicurso = minicurso;
	}


	public Minicurso getMinicursoEditar() {
		return minicursoEditar;
	}


	public void setMinicursoEditar(Minicurso minicursoEditar) {
		this.minicursoEditar = minicursoEditar;
	}


	public Minicurso getMinicursoExcluir() {
		return minicursoExcluir;
	}


	public void setMinicursoExcluir(Minicurso minicursoExcluir) {
		this.minicursoExcluir = minicursoExcluir;
	}




	public List<Minicurso> getMinicursos() {
		return minicursos;
	}




	public void setMinicursos(List<Minicurso> minicursos) {
		this.minicursos = minicursos;
	}
	
	
	
	
	
}
