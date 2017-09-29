package br.com.semComp.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import br.com.semComp.model.Minicurso;
import br.com.semComp.util.JpaUtil;

public class MinicursoDAO {

	private final JpaUtil factory;
	private final EntityManager gerenciador;

	public MinicursoDAO() {
		this.factory = new JpaUtil();
		this.gerenciador = factory.getEntityManager();
	}

	public void salvarMinicurso(Minicurso minicurso) {
		EntityTransaction transaction = gerenciador.getTransaction();
		transaction.begin();
		gerenciador.persist(minicurso);
		transaction.commit();
		
	}

	public void alterarMinicurso(Minicurso minicurso) {
		EntityTransaction transaction = gerenciador.getTransaction();
		transaction.begin();
		gerenciador.merge(minicurso);
		transaction.commit();
		
	}

	public void excluirMinicurso(Minicurso minicurso) {
		EntityTransaction transaction = gerenciador.getTransaction();
		transaction.begin();
		gerenciador.remove(minicurso);
		transaction.commit();
	
	}

	public List<Minicurso> buscarTodosCursos() {

		TypedQuery<Minicurso> query = gerenciador.createNamedQuery("Minicurso.buscarTodos", Minicurso.class);
		return query.getResultList();

	}

	public Minicurso buscarCursoId(Long id) {

		TypedQuery<Minicurso> query = gerenciador.createNamedQuery("Minicurso.buscarPorId", Minicurso.class);

		query.setParameter("id", id);
		return query.getSingleResult();

	}

}
