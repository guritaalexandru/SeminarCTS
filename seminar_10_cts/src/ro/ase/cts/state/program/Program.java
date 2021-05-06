package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Masa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Masa masa = new Masa(3);
		masa.elibereazaMasa();
		masa.rezervaMasa();
		masa.ocupaMasa();
		masa.elibereazaMasa();

	}

}
