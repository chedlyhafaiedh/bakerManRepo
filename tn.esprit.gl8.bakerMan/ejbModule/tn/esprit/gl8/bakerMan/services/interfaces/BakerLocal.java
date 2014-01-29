package tn.esprit.gl8.bakerMan.services.interfaces;

import javax.ejb.Local;

@Local
public interface BakerLocal {
	void confectioner(String nameOfTheCake);

}
