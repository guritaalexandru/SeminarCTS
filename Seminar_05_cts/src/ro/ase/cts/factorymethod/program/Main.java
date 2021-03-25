package ro.ase.cts.factorymethod.program;

import ro.ase.cts.factorymethod.clase.AsistentFactory;
import ro.ase.cts.factorymethod.clase.FactoryPersonal;
import ro.ase.cts.factorymethod.clase.InfirmierFactory;
import ro.ase.cts.factorymethod.clase.MedicFactory;
import ro.ase.cts.factorymethod.clase.PersonalSpital;

public class Main {
	
	public static void printeazaPersonalSpital(FactoryPersonal fabrica, String nume) {
		PersonalSpital personal = fabrica.getPersonalSpital(nume);
		System.out.println(personal.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printeazaPersonalSpital(new MedicFactory(), "Alex");
		printeazaPersonalSpital(new AsistentFactory(), "Madalin");
		printeazaPersonalSpital(new InfirmierFactory(), "Mihai");

	}

}
