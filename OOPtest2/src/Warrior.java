
public class Warrior extends ROLE{
	
	Warrior(){super();}
	
	Warrior(String name,int life, int magic){
		super(name,life,magic);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setLife(int Life) {
		this.Life = Life;
	}
	public void setMagic(int Magic) {
		this.Magic = Magic;
	}
	public String getName() {
		return name;
	}
	public int getLife() {
		return Life;
	}
	public int getMagic() {
		return Magic;
	}
	
	public void NewMoon(Warrior W) {
		if(Magic<=10) {
			System.out.println("ran out of mana,did not cast attack");
		}
		else {
			Magic-=10;
			W.setLife(W.getLife()-25);
			
			if(W.getLife() <=0) {
				System.out.println(W.getName()+" Was slained by "+name);
				System.exit(0);
			}
		}
	}
	
	public void NewMoon(Witch W) {
		if(Magic<=10) {
			System.out.println("ran out of mana,did not cast attack");
		}
		else {
			Magic-=10;
			W.setLife(W.getLife()-40);
			
			if(W.getLife() <=0) {
				System.out.println(W.getName()+" Was slained by "+name);
				System.exit(0);
			}
		}
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s%n%s: %d%n%s: %d%n","Character name",name,"Life",Life,"Magic",Magic);
	}
}