package ro.ase.cts.factorymethod.clase;

public class MedicFactory implements FactoryPersonal{

	@Override
	public PersonalSpital getPersonalSpital(String nume) {
		// TODO Auto-generated method stub
		return new Medic(nume);
	}

}
