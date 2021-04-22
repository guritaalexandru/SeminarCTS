package ro.ase.cts.Strategy.program;

import ro.ase.cts.Strategy.clase.Card;
import ro.ase.cts.Strategy.clase.Client;
import ro.ase.cts.Strategy.clase.Portofel;

public class Program {

	public static void main(String[] args) {
		Portofel portofel = new Portofel(300);
		Client Alin = new Client(portofel, "Alin");
		Alin.platesteNota(200);
		
		Alin.setStrategy(new Card());
		Alin.platesteNota(200);

		Alin.setStrategy(portofel);
		Alin.platesteNota(200);

	}

}
