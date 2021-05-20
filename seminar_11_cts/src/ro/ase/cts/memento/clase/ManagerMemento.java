package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
	private List<Memento> listaMemento = new ArrayList<Memento>();
	
	public void adaugaMemento(Memento memento) {
		listaMemento.add(memento);
	}
	
	public Memento getMemento(int pos) {
		if(pos >= 0 && pos < listaMemento.size()) {
			return listaMemento.get(pos);
		}
		throw new IllegalArgumentException("Index nevalid");
	}
}
