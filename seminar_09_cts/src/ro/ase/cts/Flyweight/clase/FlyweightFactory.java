package ro.ase.cts.Flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private Map<String, Flyweight> listaClienti;
	
	public FlyweightFactory() {
		super();
		this.listaClienti = new HashMap<String, Flyweight>();
	}

	public Flyweight getClient(String nrTelefon) {
		Flyweight flyweight = listaClienti.get(nrTelefon);
		if(flyweight == null) {
			flyweight = new Client("Ion", nrTelefon, "ion@gmail.com");
			listaClienti.put(nrTelefon, flyweight);
		}
		return flyweight;

	}
}
