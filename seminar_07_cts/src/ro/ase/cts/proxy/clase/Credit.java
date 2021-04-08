package ro.ase.cts.proxy.clase;

public class Credit implements CreditAbstract{

	@Override
	public void oferaCredit(TipMoneda tip, float suma) {
		System.out.println("S-a oferit un credit de " + suma + " " + tip);
	}
	
}
