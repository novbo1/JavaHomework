
public class Witch {
	private String name;
	private int life;
	int magic;
	
	Witch(){};
	Witch(String name,int life, int magic){
		this.name = name;
		this.life = life;
		this.magic = magic;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public void setMagic(int magic) {
		this.magic = magic;
	}
	public String getName() {
		return name;
	}
	public int getLife() {
		return life;
	}
	public int getMagic() {
		return magic;
	}
	
	public void SmallFire(Warrior W) {
		if (magic<25) {
			System.out.println("Ran out of mana, did not cast attack");
		}
		else {
			magic-=25;
			W.setLife(W.getLife()-40);
			
			if(W.getLife()<=0) {
				System.out.println(W.getName()+" Was slained by "+name);
				System.exit(0);
			}
		}
	}
	
	public void SmallFire(Witch W) {
		if (magic<25) {
			System.out.println("Ran out of mana, did not cast attack");
		}
		else {
			magic-=25;
			W.setLife(W.getLife()-40);
			
			if(W.getLife()<=0) {
				System.out.println(W.getName()+" Was slained by "+name);
				System.exit(0);
			}
		}
	}
}
