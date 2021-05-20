package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMemento;
import ro.ase.cts.memento.clase.MeciJucat;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MeciJucat meci = new MeciJucat("Galati", "Braila", 30, 40, 4);
		ManagerMemento managerMemento = new ManagerMemento();
		managerMemento.adaugaMemento(meci.creareMemento());
		
		meci.setNrJandarmi(7);
		meci.setNrSpectatori(100);
		meci.setNrSticleVandute(160);
		meci.setNumeGazda("F.C.Galati");
		
		managerMemento.adaugaMemento(meci.creareMemento());

		System.out.println(meci.toString());
		meci.setMemento(managerMemento.getMemento(0));
		System.out.println(meci.toString());

	}

}
