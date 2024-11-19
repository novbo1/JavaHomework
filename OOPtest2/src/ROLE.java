
public class ROLE {
	protected String name;
	protected int Life;
	protected int Magic;
	
	public ROLE(String name, int Life , int Magic) {
		this.name = name;
		this.Life = Life;
		this.Magic = Magic;
	}
	
	public ROLE() {
		name = "NULL";
		Life = -1;
		Magic = -1;
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s%n%s: %d%n%s: %d%n","Base Character Name",name,"Life",Life,"Magic",Magic);
	}
}