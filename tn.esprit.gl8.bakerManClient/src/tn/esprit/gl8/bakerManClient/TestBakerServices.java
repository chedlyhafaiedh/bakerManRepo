package tn.esprit.gl8.bakerManClient;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.gl8.bakerMan.services.interfaces.BakerRemote;

public class TestBakerServices {

	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			BakerRemote proxy = (BakerRemote) context
					.lookup("tn.esprit.gl8.bakerMan/Baker!tn.esprit.gl8.bakerMan.services.interfaces.BakerRemote");
			proxy.confectioner("cake of the air");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
