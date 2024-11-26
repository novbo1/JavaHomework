
class Witch extends ROLE{
	
	Witch() {}
	
	Witch(String name, int life , int magic){
		super(name,life,magic);
	}
	
	public void SmallFire(ROLE R) {

		if(getMagic()<25) {
			System.out.println("Ran out of mana, did not cast attack");
		}
		else {
			setMagic(getMagic()-25);
			
			if(R instanceof Warrior) {
				R.setLife(R.getLife()-40);
			}
			else {
				R.setLife(R.getLife()-60);
			}
			
			if(R.getLife() <=0) {
				System.out.printf("%s was slained by %s%n",R.getName(),getName());
				System.exit(0);
			}
		}
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s%n%s: %d%n%s: %d%n","Character name",getName(),"Life",getLife(),"Magic",getMagic());
	}
}