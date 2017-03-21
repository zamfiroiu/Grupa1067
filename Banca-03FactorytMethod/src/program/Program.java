package program;

import factorymethod.Client;
import factorymethod.Factory;
import factorymethod.FactoryPersoanaFizica;
import factorymethod.FactoryPersoanaJuridica;

public class Program {

	private static void afisareDetaliiClient(Factory fabrica) {
		
		Client client = fabrica.getClient("Ionescu");
		System.out.println(client.getNumeClient());
		client.descriere();
	}
	
	
	public static void main(String[] args) {
		afisareDetaliiClient(new FactoryPersoanaJuridica());
	}

}
