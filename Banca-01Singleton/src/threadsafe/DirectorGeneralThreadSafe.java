package threadsafe;

public class DirectorGeneralThreadSafe {
	private String nume;
	private float salariu;
	
	private static DirectorGeneralThreadSafe instanta = null;
	
	public static synchronized DirectorGeneralThreadSafe getInstance(String nume, float salariu) {
		if(instanta == null) {
			instanta = new DirectorGeneralThreadSafe(nume, salariu);
		}
		return instanta;
	}
	
	private DirectorGeneralThreadSafe() {
		this("Gigel", 2000);
	}

	private DirectorGeneralThreadSafe(String nume, float salariu) {
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
