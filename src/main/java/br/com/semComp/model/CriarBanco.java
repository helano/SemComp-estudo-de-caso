package br.com.semComp.model;

import javax.persistence.Persistence;

import br.com.semComp.util.JpaUtil;

public class CriarBanco {

	
	public static void main(String[] args) {
		
		Persistence.createEntityManagerFactory("SemComp");
	}
	
}
