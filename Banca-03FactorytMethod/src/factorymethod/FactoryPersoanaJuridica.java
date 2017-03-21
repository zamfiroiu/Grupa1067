package factorymethod;

public class FactoryPersoanaJuridica implements Factory {

	@Override
	public Client getClient(String nume) {
		return new PersoanaJuridica(nume);
	}

}
