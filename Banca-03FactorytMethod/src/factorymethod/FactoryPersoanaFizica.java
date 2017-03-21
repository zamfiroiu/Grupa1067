package factorymethod;

public class FactoryPersoanaFizica implements Factory {

	@Override
	public Client getClient(String nume) {
		return new PersoanaFizica(nume);
	}

}
