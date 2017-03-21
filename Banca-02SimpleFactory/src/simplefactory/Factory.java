package simplefactory;

public class Factory {

	public Credit getCredit(TipCredit tipCredit) {
		switch(tipCredit){
			case creditIpotecar: {
				return new CreditIpotecar();
				}
			case creditNP: {
				return new CreditNevoiePersonale();
			}
		}
		return null;
	}
}
