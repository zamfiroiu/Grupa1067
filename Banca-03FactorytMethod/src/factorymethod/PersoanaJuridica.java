package factorymethod;

public class PersoanaJuridica implements Client {

	private String nume;
	
	public PersoanaJuridica(String nume) {
		this.nume=nume;
	}
	
	@Override
	public void descriere() {
		System.out.println("Clientul este o persoana juridica");
	}

	@Override
	public String getNumeClient() {
		return this.nume;
	}

}
