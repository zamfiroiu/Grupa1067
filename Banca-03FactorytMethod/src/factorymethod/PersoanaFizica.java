package factorymethod;

public class PersoanaFizica implements Client {

	private String nume;
	
	public PersoanaFizica(String nume) {
		this.nume=nume;
	}
	
	@Override
	public void descriere() {
		System.out.println("Clientul este persoana fizica");

	}

	@Override
	public String getNumeClient() {
		return this.nume;
	}

}
