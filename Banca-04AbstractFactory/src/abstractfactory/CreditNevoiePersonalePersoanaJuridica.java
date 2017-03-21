package abstractfactory;

public class CreditNevoiePersonalePersoanaJuridica implements CreditPersoanaJuridica {

	@Override
	public String getDescriere() {
		return "Acest credit este de nevoie personale pentru persoane juridice";
	}

}
