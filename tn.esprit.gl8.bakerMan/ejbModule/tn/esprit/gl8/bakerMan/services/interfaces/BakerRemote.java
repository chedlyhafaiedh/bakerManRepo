package tn.esprit.gl8.bakerMan.services.interfaces;

import javax.ejb.Remote;

import tn.esprit.gl8.bakerMan.domain.Cake;

@Remote
public interface BakerRemote {
	void confectioner(String nameOfTheCake);

	void prepareCake(Cake cake);
}
