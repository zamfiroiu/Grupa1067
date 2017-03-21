package abstractfactory;

public class CreditNevoiPersonalePersoaneFizice implements CreditPersoanaFizica {

	@Override
	public String descriere() {
		return "Acest credit este de nevoie personale pentru persoane fizice";
	}

}
