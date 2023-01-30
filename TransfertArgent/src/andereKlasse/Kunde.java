package andereKlasse;

public class Kunde {
	
	private String name;
	private String email;
	private int kundeId;
	
	
	public Kunde(String name, String email, int kundeId) {
		super();
		this.name = name;
		this.email = email;
		this.kundeId = kundeId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getKundeId() {
		return kundeId;
	}
	public void setKundeId(int kundeId) {
		this.kundeId = kundeId;
	}
	
	
}
