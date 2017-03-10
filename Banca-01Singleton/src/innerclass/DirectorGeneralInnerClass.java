package innerclass;

public class DirectorGeneralInnerClass {
	private String nume;
	private float salariu;
	
	private static class InnerClassDirectorGeneral{
		public static DirectorGeneralInnerClass instanta = new DirectorGeneralInnerClass();
	}
	
	public static DirectorGeneralInnerClass getInstance() {
		return InnerClassDirectorGeneral.instanta;
	}
	
	private DirectorGeneralInnerClass() {
		this("Gigel", 2000);
	}

	private DirectorGeneralInnerClass(String nume, float salariu) {
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
