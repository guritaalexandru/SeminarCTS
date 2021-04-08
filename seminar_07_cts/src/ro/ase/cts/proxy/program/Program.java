package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.Credit;
import ro.ase.cts.proxy.clase.Proxy;
import ro.ase.cts.proxy.clase.TipMoneda;

public class Program {

	public static void main(String[] args) {
		Credit credit = new Credit();
		credit.oferaCredit(TipMoneda.EUR, 100);
		
		Proxy proxyCredit = new Proxy(credit);
		proxyCredit.oferaCredit(TipMoneda.EUR, 100);
		proxyCredit.oferaCredit(TipMoneda.RON, 400);

	}

}
