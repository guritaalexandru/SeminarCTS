package ro.ase.cts.chain.clase;

public class ContCredit extends Cont{
	public ContCredit(float sold) {
		super(sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		// TODO Auto-generated method stub
		if(super.getSold() > suma) {
			System.out.println("Ai platit cu contul de credit!");
			super.setSold(super.getSold() - suma);
		}
		else {
			if(super.getSuccesor() == null) {
				System.out.println("Nu se poate efectua plata!");
			}
			else {
				super.getSuccesor().plateste(suma);
			}
		}
	}
}
