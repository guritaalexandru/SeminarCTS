package ro.ase.cts.program;

import ro.ase.cts.clase.BrokerTranzactie;
import ro.ase.cts.clase.BrokerTranzactieLazy;
import ro.ase.cts.clase.Protagonist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrokerTranzactie broker1 = BrokerTranzactie.getInstance();
		BrokerTranzactie broker2 = BrokerTranzactie.getInstance();
		System.out.println(broker1.toString());
		System.out.println(broker2.toString());
		
		broker1.setNume("Alina");
		broker2.setNrTranzactiiEfectuate(9);
		System.out.println(broker1.toString());
		System.out.println(broker2.toString());
		
		BrokerTranzactieLazy lazy1 = BrokerTranzactieLazy.getInstance("Ana", 2, 30);
		BrokerTranzactieLazy lazy2 = BrokerTranzactieLazy.getInstance("Bianca", 4, 50);
		
		System.out.println(lazy1.toString());
		System.out.println(lazy2.toString());
		
		Protagonist protagonist1 = Protagonist.getInstance("Fat-Frumos din lacrima", 5, true); 
		Protagonist protagonist2 = Protagonist.getInstance("Praslea cel voinic si merele de aur", 7, true); 
		
		System.out.println(protagonist1.toString());
		System.out.println(protagonist2.toString());
	}

}
