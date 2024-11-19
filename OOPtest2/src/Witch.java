
public class Witch extends ROLE{

	Witch(){super();}
	Witch(String name,int life, int magic){
		super(name,life,magic);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setLife(int life) {
		this.Life = life;
	}
	public void setMagic(int magic) {
		this.Magic = magic;
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
	
	public void SmallFire(Warrior W) {
		if (Magic<25) {
			System.out.println("Ran out of mana, did not cast attack");
		}
		else {
			Magic-=25;
			W.setLife(W.getLife()-40);
			
			if(W.getLife()<=0) {
				System.out.println(W.getName()+" Was slained by "+name);
				System.exit(0);
			}
		}
	}
	
	public void SmallFire(Witch W) {
		if (Magic<25) {
			System.out.println("Ran out of mana, did not cast attack");
		}
		else {
			Magic-=25;
			W.setLife(W.getLife()-60);
			
			if(W.getLife()<=0) {
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