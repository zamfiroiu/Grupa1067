package program;

import simplefactory.Credit;
import simplefactory.Factory;
import simplefactory.TipCredit;

public class Program {

	public static void main(String[] args) {
		Factory fabricaCredite=new Factory();
		Credit credit = fabricaCredite.getCredit(TipCredit.creditIpotecar);
		
		credit.descriereCredit();
	}

}
