package abstractfactory;

public class CreditIpotecarPersoanaFizica implements CreditPersoanaFizica {

	@Override
	public String descriere() {
		return "Acest credit este ipotecar pentru persoane fizice";
	}

}
