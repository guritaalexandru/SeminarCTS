package ro.ase.cts.factorymethod.clase;

public class BrancardierFactory implements FactoryPersonal{

	@Override
	public PersonalSpital getPersonalSpital(String nume) {
		// TODO Auto-generated method stub
		return new Brancardier(nume);
	}

}
