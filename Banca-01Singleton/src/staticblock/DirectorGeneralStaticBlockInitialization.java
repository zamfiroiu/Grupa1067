package staticblock;

public class DirectorGeneralStaticBlockInitialization {
	private String nume;
	private float salariu;
	
	private static DirectorGeneralStaticBlockInitialization instanta ;
	static{
		try {
			instanta = new DirectorGeneralStaticBlockInitialization();
		} catch(Exception exception) {
			System.out.println(exception);
		}
	}
	
	public static DirectorGeneralStaticBlockInitialization getInstance() {
		return instanta;
	}
	
	private DirectorGeneralStaticBlockInitialization() {
		this("Gigel", 2000);
	}

	private DirectorGeneralStaticBlockInitialization(String nume, float salariu) {
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
