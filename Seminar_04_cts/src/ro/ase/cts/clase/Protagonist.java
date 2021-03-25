package ro.ase.cts.clase;

public class Protagonist {
	private String numeBasm;
	private int nrVictorii;
	private boolean estePrint;
	private static Protagonist protagonist = null;

	public static synchronized Protagonist getInstance(String numeBasm, int victorii, boolean estePrint) {
		if(protagonist == null) {
			protagonist = new Protagonist(numeBasm, victorii, estePrint);
		}
		return protagonist;
	}
	
	private Protagonist(String numeBasm, int victorii, boolean estePrint) {
		super();
		this.numeBasm = numeBasm;
		this.nrVictorii = victorii;
		this.estePrint = estePrint;
	}

	public void setNumeBasm(String numeBasm) {
		this.numeBasm = numeBasm;
	}

	public void setNrVictorii(int victorii) {
		this.nrVictorii = victorii;
	}

	public void setEstePrint(boolean estePrint) {
		this.estePrint = estePrint;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Protagonist [numeBasm=");
		builder.append(numeBasm);
		builder.append(", nrVictorii=");
		builder.append(nrVictorii);
		builder.append(", estePrint=");
		builder.append(estePrint);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
