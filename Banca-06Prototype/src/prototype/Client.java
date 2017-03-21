package prototype;

public class Client implements ClientPrototype{
	private String nume;
	private String cnp;
	private int varsta;
	
	public Client clone(){
		Client client=new Client();
		client.setCnp(this.cnp);
		client.setNume(this.nume);
		client.setVarsta(this.varsta);
		return client;
	}
	
	@Override
	public String toString() {
		return "Client [nume=" + nume + ", cnp=" + cnp + ", varsta=" + varsta + "]";
	}
	public Client(String nume, String cnp, int varsta) throws Exception {
		super();
		if(!nume.isEmpty()){
			this.nume = nume;
		}else{
			throw new Exception("NUme incorect");
		}
		if(cnp.length()==13){
			this.cnp = cnp;
		}else{
			throw new Exception("CNP incorect");			
		}
		this.varsta = varsta;
	}
	
	public Client() {
	}
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getCnp() {
		return cnp;
	}
	public void setCnp(String cnp) {
		this.cnp = cnp;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	
	
}
