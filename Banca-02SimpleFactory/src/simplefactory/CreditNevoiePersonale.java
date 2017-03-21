package simplefactory;

public class CreditNevoiePersonale implements Credit {

	@Override
	public double getSumaImprumutata() {
		return 5000;
	}

	@Override
	public void descriereCredit() {
		System.out.println("Credit de nevoie personale!");
	}

}
