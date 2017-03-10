package lazyinitialization;

public class DirectorGeneral {
	private String nume;
	private float salariu;
	
	private static DirectorGeneral instanta = null;
	
	public static DirectorGeneral getInstance(String nume, float salariu) {
		if(instanta == null) {
			instanta = new DirectorGeneral(nume, salariu);
		}
		return instanta;
	}
	
	private DirectorGeneral() {
		this("Gigel", 2000);
	}

	private DirectorGeneral(String nume, float salariu) {
		super();
		this.nume = nume;
		this.salariu = salariu;
	}
		
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public float getSalariu() {
		return salariu;
	}

	public void setSalariu(float salariu) {
		this.salariu = salariu;
	}

	@Override
	public String toString() {
		return "DirectorGeneral [nume=" + nume + ", salariu=" + salariu + "]";
	}	
}
