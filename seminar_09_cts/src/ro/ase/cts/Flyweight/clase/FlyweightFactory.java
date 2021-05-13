package ro.ase.cts.Flyweight.clase;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FlyweightFactory {
	private Map<String, Flyweight> listaClienti;
	
	public FlyweightFactory() {
		super();
		this.listaClienti = new HashMap<String, Flyweight>();
	}

	public Flyweight getClient(String nrTelefon) {
		Flyweight flyweight = listaClienti.get(nrTelefon);
		if(flyweight == null) {
			Scanner scanner = new Scanner(System.in);
			String nume = scanner.next();
			String adresaMail = scanner.next();
			flyweight = new Client(nume, nrTelefon, adresaMail);
			listaClienti.put(nrTelefon, flyweight);
		}
		return flyweight;

	}
}
