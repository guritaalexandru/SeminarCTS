package ro.ase.cts.Flyweight.program;

import java.util.Scanner;

import ro.ase.cts.Flyweight.clase.FlyweightFactory;
import ro.ase.cts.Flyweight.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare r1 = new Rezervare(5, 3, 17);
		Rezervare r2 = new Rezervare(4, 2, 18);
		Rezervare r3 = new Rezervare(2, 7, 19);

		FlyweightFactory fabrica = new FlyweightFactory();
		System.out.println("Ceva");
		Scanner scanner = new Scanner(System.in);
		String nrTel = scanner.next();
		
		fabrica.getClient(nrTel).printeazaRezervare(r1);
		
		nrTel = scanner.next();
		
		fabrica.getClient(nrTel).printeazaRezervare(r2);
		
		nrTel = scanner.next();
		
		fabrica.getClient(nrTel).printeazaRezervare(r3);
	}

}
