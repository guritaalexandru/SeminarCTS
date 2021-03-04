package program;

import clase.Giraffe;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo z = new Zoo();
		Giraffe giraffe = new Giraffe("Girafa1");
		Giraffe giraffe2 = new Giraffe("Girafa2");

		z.addAnimal(giraffe);
		z.addAnimal(giraffe2);
		
		z.feedAllAnimals();
		
		Zebra z1 = new Zebra("zebra1");
		Zebra z2 = new Zebra("zebra2");
		
		z.addAnimal(z1);
		z.addAnimal(z2);

		z.feedAllAnimals();

	}

}
