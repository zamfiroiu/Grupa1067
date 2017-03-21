package abstractfactory;

public class FactoryCrediteIpotecare implements Factory {

	@Override
	public CreditPersoanaFizica getCreditPersoanaFizica() {
		return new CreditIpotecarPersoanaFizica();
	}

	@Override
	public CreditPersoanaJuridica getCreditPersoanaJuridica() {
		return new CreditIpotecarPersoaneJuridice();
	}

}
