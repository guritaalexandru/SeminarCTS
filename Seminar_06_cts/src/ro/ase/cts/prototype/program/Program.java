package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.Bilet;
import ro.ase.cts.prototype.clase.ContClient;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContClient contClient1 = new ContClient("Alex", 21, 10);
		ContClient contClient2 = (ContClient) contClient1.copiaza();
		
		System.out.println(contClient1);
		System.out.println(contClient2);

		Bilet biletPrototype = new Bilet(1, "Steaua", "Dinamo", "01.04.2021");
		Bilet bilet1 = (Bilet) biletPrototype.copiaza();
		bilet1.setCodBilet(2);
		Bilet bilet2 = (Bilet) biletPrototype.copiaza();
		bilet1.setCodBilet(3);
		
		System.out.println(bilet1);
		System.out.println(bilet2);

	}

}
