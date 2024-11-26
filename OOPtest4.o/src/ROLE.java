import java.security.SecureRandom;

public class ROLE {
	private String name;
	private int life;
	private int magic;
	private static final SecureRandom RNG = new SecureRandom();
	
	public ROLE(String name, int life , int magic) {
		this.name = name;
		this.life = life;
		this.magic = magic;
	}
	
	public ROLE() {
		name = "NULL";
		life = -1;
		magic = -1;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setLife(int life) {
		this.life = life;
	}
	
	public int getLife() {
		return life;
	}
	
	public void setMagic(int magic) {
		this.magic = magic;
	}
	
	public int getMagic() {
		return magic;
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s%n%s: %d%n%s: %d%n","Base Character Name",name,"Life",life,"Magic",magic);
	}

	public void drink(Drug R) {
		if(this.life< 100 || this.magic < 70) {
			if(R instanceof RedDrug) {
				this.life += R.getAddLife();
			}
			else if(R instanceof BlueDrug) {
				this.magic += R.getAddMagic();
		}
		}
	}
	
	public static String getDrugSize() {
		int P = RNG.nextInt(100);
		
		if(P < 10) {
			return "Large";
		}
		else if (P<30) {
			return "Medium";
		}
		else if(P<80) {
			return "Small";
		}
		else {
			return "NULL";
		}
	}
	

}