package eagerinitialization;

public class DirectorGeneralEagerinItialization {
	private String nume;
	private float salariu;
	
	private static final DirectorGeneralEagerinItialization instanta = new DirectorGeneralEagerinItialization();
	
	public static DirectorGeneralEagerinItialization getInstance() {
		return instanta;
	}
	
	private DirectorGeneralEagerinItialization() {
		this("Gigel", 2000);
	}

	private DirectorGeneralEagerinItialization(String nume, float salariu) {
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
