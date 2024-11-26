import java.security.SecureRandom;

public class Driver {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		SecureRandom RNG = new SecureRandom();
		Warrior Warrior1 = new Warrior("First Warrior",400,100);
		Warrior Warrior2 = new Warrior("Second Warrior",400,100);
		Warrior Warrior3 = new Warrior("Third Warrior",400,100);
		Witch Witch1 = new Witch("First Witch",280,200);
		Witch Witch2 = new Witch("Second Witch",280,200);
		Witch Witch3 = new Witch("Third Witch",280,200);
		
		ROLE[] characters = new ROLE[6];
		characters[0] = Warrior1;
		characters[1] = Warrior2;
		characters[2] = Warrior3;
		characters[3] = Witch1;
		characters[4] = Witch2;
		characters[5] = Witch3;
		
		ROLE attacker = new ROLE();
		ROLE target = new ROLE();
		
		//basic info
		System.out.println("Basic information");
		for(int i = 0 ; i < 6 ; i++) {
			System.out.printf("%s%n",characters[i].toString());
		}
		
		//fight simulation  
		while(true) {
				attacker = characters[RNG.nextInt(3)];
				target = characters[RNG.nextInt(3)+3];
				
				System.out.printf("%s Was hit by %s%n",target.getName(),attacker.getName());
				((Warrior) attacker).NewMoon(target);
				System.out.printf("%s %n %s %n%n",attacker.toString(),target.toString());
				
				attacker = characters[RNG.nextInt(3)+3];
				target = characters[RNG.nextInt(3)];
				
				System.out.printf("%s Was hit by %s%n", attacker.getName(), target.getName());
				((Witch) attacker).SmallFire(target);
				System.out.printf("%s %n %s %n%n",attacker.toString(),target.toString());
				
		}
		
		
		
	}

}