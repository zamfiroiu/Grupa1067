package program;

import abstractfactory.CreditPersoanaFizica;
import abstractfactory.CreditPersoanaJuridica;
import abstractfactory.Factory;
import abstractfactory.FactoryCreditNevoiePersonale;
import abstractfactory.FactoryCrediteIpotecare;

public class Program {

	public static void main(String[] args) {
		Factory fabrica = new FactoryCreditNevoiePersonale();
		
		CreditPersoanaFizica creditPersoanaFizica = fabrica.getCreditPersoanaFizica();
		CreditPersoanaJuridica creditPersoanaJuridica=fabrica.getCreditPersoanaJuridica();
		
		System.out.println(creditPersoanaFizica.descriere());
		System.out.println(creditPersoanaJuridica.getDescriere());
		
	}

}
