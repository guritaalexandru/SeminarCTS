package ro.ase.cts.factorymethod.clase;

public class Infirmier extends PersonalSpital{

	public Infirmier(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Infirmier [getNume()=");
		builder.append(getNume());
		builder.append("]");
		return builder.toString();
	}

	
}
