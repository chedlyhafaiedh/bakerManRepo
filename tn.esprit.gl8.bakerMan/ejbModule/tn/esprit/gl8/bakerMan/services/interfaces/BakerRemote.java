package tn.esprit.gl8.bakerMan.services.interfaces;

import javax.ejb.Remote;

@Remote
public interface BakerRemote {
	void confectioner(String nameOfTheCake);

}
