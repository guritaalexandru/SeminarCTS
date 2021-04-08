package ro.ase.cts.adapterclase.program;

import ro.ase.cts.adapterclase.clase.AdaptorCreditClase;
import ro.ase.cts.adapterclase.clase.CreditAbstract;

public class Program {
	
	public static void afiseazaInformatiiCredit(CreditAbstract credit) {
		credit.oferaCredit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdaptorCreditClase adaptorClase = new AdaptorCreditClase(50, "Ana");
		afiseazaInformatiiCredit(adaptorClase);
	}

}
