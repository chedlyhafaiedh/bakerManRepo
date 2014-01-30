package tn.esprit.gl8.bakerMan.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.gl8.bakerMan.domain.Cake;
import tn.esprit.gl8.bakerMan.services.interfaces.BakerLocal;
import tn.esprit.gl8.bakerMan.services.interfaces.BakerRemote;

/**
 * Session Bean implementation class Baker
 */
@Stateless
public class Baker implements BakerRemote, BakerLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public Baker() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void confectioner(String nameOfTheCake) {
		System.out.println("your cake wich is " + nameOfTheCake + " is ready");

	}

	@Override
	public void prepareCake(Cake cake) {
		entityManager.persist(cake);
	}

}
