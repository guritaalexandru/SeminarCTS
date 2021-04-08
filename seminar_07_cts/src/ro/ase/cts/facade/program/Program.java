package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Persoana;

public class Program {
	public static void main(String[] args) {
		Persoana persoana = new Persoana("1234567891234", "Alex");
		
		if(Facade.esteEligibil(persoana)) {
			System.out.println("Okay");
		}
		else {
			System.out.println("NotOkay");
		}
	}
}
