package simplefactory;

public class CreditIpotecar implements Credit {

	@Override
	public double getSumaImprumutata() {
		return 50000;
	}

	@Override
	public void descriereCredit() {
		System.out.println("Acesta este un credit ipotecar.");

	}

}
