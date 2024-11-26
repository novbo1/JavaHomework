
public class Priest extends ROLE{
	public Priest() {}
	public Priest(String name, int life, int magic) {
		super(name,life,magic);
	}
	
	public void Dark(ROLE R) {
		if(getMagic()< 20) {
			System.out.println("Ran out of mana, did not cast attack");
		}
		else {
			setMagic(getMagic()-20);
			
			if(R instanceof Warrior) {
				R.setLife(getLife()-30);
			}
			else if(R instanceof Witch) {
				R.setLife(getLife()-50);
			}
			else {
				R.setLife(getLife()-40);
			}
		}
		
		if(R.getLife() <=0) {
			System.out.printf("%s was slained by %s%n",R.getName(),getName());
			System.exit(0);
		}
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s%n%s: %d%n%s: %d%n","Character name",getName(),"Life",getLife(),"Magic",getMagic());
	}
}
