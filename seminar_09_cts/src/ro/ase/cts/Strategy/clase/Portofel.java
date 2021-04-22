package ro.ase.cts.Strategy.clase;

public class Portofel implements Strategy{
	private float sumaDisponibila;
	
	public Portofel(float sumaDisponibila) {
		super();
		this.sumaDisponibila = sumaDisponibila;
	}

	@Override
	public void realizeazaPlata(float suma) {
		// TODO Auto-generated method stub
		if(sumaDisponibila >= suma) {
			System.out.println("Plata a fost realizata cash");
			sumaDisponibila -= suma;
		}
		else {
			System.out.println("Fonduri insuficiente");
		}
	}

}
