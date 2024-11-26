
class Warrior extends ROLE{
	
	Warrior() {}
	
	Warrior(String name, int life , int magic){
		super(name,life,magic);
	}
	
	public void NewMoon(ROLE R) {
		if(getMagic()<10) {
			System.out.println("Ran out of mana, did not cast attack");
		}
		else {
			setMagic(getMagic()-10);
			
			if(R instanceof Warrior) {
				R.setLife(R.getLife()-25);
			}
			else {
				R.setLife(R.getLife()-40);
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