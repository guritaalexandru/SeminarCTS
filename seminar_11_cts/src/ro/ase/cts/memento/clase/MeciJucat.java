package ro.ase.cts.memento.clase;

public class MeciJucat {
	private String numeGazda;
	private String numeOaspeti;
	private int nrSpectatori;
	private int nrSticleVandute;
	private int nrJandarmi;
	public MeciJucat(String numeGazda, String numeOaspeti, int nrSpectatori, int nrSticleVandute, int nrJandarmi) {
		super();
		this.numeGazda = numeGazda;
		this.numeOaspeti = numeOaspeti;
		this.nrSpectatori = nrSpectatori;
		this.nrSticleVandute = nrSticleVandute;
		this.nrJandarmi = nrJandarmi;
	}
	public String getNumeGazda() {
		return numeGazda;
	}
	public void setNumeGazda(String numeGazda) {
		this.numeGazda = numeGazda;
	}
	public String getNumeOaspeti() {
		return numeOaspeti;
	}
	public void setNumeOaspeti(String numeOaspeti) {
		this.numeOaspeti = numeOaspeti;
	}
	public int getNrSpectatori() {
		return nrSpectatori;
	}
	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}
	public int getNrSticleVandute() {
		return nrSticleVandute;
	}
	public void setNrSticleVandute(int nrSticleVandute) {
		this.nrSticleVandute = nrSticleVandute;
	}
	public int getNrJandarmi() {
		return nrJandarmi;
	}
	public void setNrJandarmi(int nrJandarmi) {
		this.nrJandarmi = nrJandarmi;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MeciJucat [numeGazda=");
		builder.append(numeGazda);
		builder.append(", numeOaspeti=");
		builder.append(numeOaspeti);
		builder.append(", nrSpectatori=");
		builder.append(nrSpectatori);
		builder.append(", nrSticleVandute=");
		builder.append(nrSticleVandute);
		builder.append(", nrJandarmi=");
		builder.append(nrJandarmi);
		builder.append("]");
		return builder.toString();
	}
	
	public Memento creareMemento(){
		return new Memento(numeGazda, numeOaspeti, nrSpectatori);
	}
	public void setMemento(Memento memento) {
		nrSpectatori = memento.getNrSpectatori();
		numeOaspeti = memento.getNumeOaspeti();
		numeGazda = memento.getNumeGazda();

	}
}
