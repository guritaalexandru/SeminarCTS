package ro.ase.cts.Flyweight.clase;

public class Rezervare {
	private int nrMasa;
	private int nrPersoane;
	private int nrRezervare;
	
	public Rezervare(int nrMasa, int nrPersoane, int nrRezervare) {
		super();
		this.nrMasa = nrMasa;
		this.nrPersoane = nrPersoane;
		this.nrRezervare = nrRezervare;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [nrMasa=");
		builder.append(nrMasa);
		builder.append(", nrPersoane=");
		builder.append(nrPersoane);
		builder.append(", nrRezervare=");
		builder.append(nrRezervare);
		builder.append("]");
		return builder.toString();
	}

	
}
