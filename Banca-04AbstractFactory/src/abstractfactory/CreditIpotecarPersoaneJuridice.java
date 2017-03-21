package abstractfactory;

public class CreditIpotecarPersoaneJuridice implements CreditPersoanaJuridica {

	@Override
	public String getDescriere() {
		return "Acest credit este ipotecar pentru persoane juridice";
	}

}
