package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private Zookeeper zookeeper;
	private List<Animal> animals;
	
	public Zoo() {
		super();
		this.zookeeper = new Zookeeper("Gigel");
		this.animals = new ArrayList<Animal>();
	}

	public Zoo(Zookeeper zookeeper, List<Animal> animals) {
		super();
		this.zookeeper = zookeeper;
		this.animals = animals;
	}
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void feedAllAnimals(){
		for(Animal animal : animals) {
			zookeeper.feed(animal);
		}
	}
}
