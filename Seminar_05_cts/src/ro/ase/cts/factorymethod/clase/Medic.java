package ro.ase.cts.factorymethod.clase;

public class Medic extends PersonalSpital{

	public Medic(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medic [getNume()=");
		builder.append(getNume());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
