package abstractfactory;

public class FactoryCreditNevoiePersonale implements Factory {

	@Override
	public CreditPersoanaFizica getCreditPersoanaFizica() {
		return new CreditNevoiPersonalePersoaneFizice();
	}

	@Override
	public CreditPersoanaJuridica getCreditPersoanaJuridica() {
		return new CreditNevoiePersonalePersoanaJuridica();
	}

}
