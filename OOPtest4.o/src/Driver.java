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
			Priest Priest1 = new Priest("First Priest",340,160);
			Priest Priest2 = new Priest("Second Priest",340,160);
			Priest Priest3 = new Priest("Third Priest",340,160);
			
			ROLE[] characters = new ROLE[9];
			characters[0] = Warrior1;
			characters[1] = Warrior2;
			characters[2] = Warrior3;
			characters[3] = Witch1;
			characters[4] = Witch2;
			characters[5] = Witch3;
			characters[6] = Priest1;
			characters[7] = Priest2;
			characters[8] = Priest3;
			
			ROLE attacker = new ROLE();
			ROLE target = new ROLE();
			
			BlueDrug BD = new BlueDrug();
			RedDrug RD = new RedDrug();
			
			//basic info
			System.out.println("Basic information");
			for(int i = 0 ; i < 6 ; i++) {
				System.out.printf("%s%n",characters[i].toString());
			}
			
			//fight simulation  
			while (true) {
	            // Warrior attacks
	            RD.setSize(ROLE.getDrugSize());
	            BD.setSize(ROLE.getDrugSize());
	            attacker = characters[RNG.nextInt(3)];  // Warrior (0-2)
	            target = characters[RNG.nextInt(6) + 3]; // Witch (3-5)

	            if (target.getLife() > 0) {  // Check if target is alive
	                System.out.printf("%s Was hit by %s%n", target.getName(), attacker.getName());
	                ((Warrior) attacker).NewMoon(target);
	                System.out.printf("%s%n%s%n%n", attacker.toString(), target.toString());
	                target.drink(RD);  // Apply RedDrug effect
	                target.drink(BD);  // Apply BlueDrug effect
	            }

	            // Witch attacks
	            RD.setSize(ROLE.getDrugSize());
	            BD.setSize(ROLE.getDrugSize());
	            attacker = characters[RNG.nextInt(3) + 3];  // Witch (3-5)
	            target = characters[RNG.nextInt(3)];  // Warrior (0-2)

	            if (target.getLife() > 0) {  // Check if target is alive
	                System.out.printf("%s Was hit by %s%n", attacker.getName(), target.getName());
	                ((Witch) attacker).SmallFire(target);
	                System.out.printf("%s%n%s%n%n", attacker.toString(), target.toString());
	                target.drink(RD);  // Apply RedDrug effect
	                target.drink(BD);  // Apply BlueDrug effect
	            }

	            // Priest attacks
	            RD.setSize(ROLE.getDrugSize());
	            BD.setSize(ROLE.getDrugSize());
	            attacker = characters[RNG.nextInt(6)];  // Priest (6-8)
	            target = characters[RNG.nextInt(3) + 6]; // Priest (6-8)

	            if (target.getLife() > 0) {  // Check if target is alive
	                System.out.printf("%s Was hit by %s%n", target.getName(), attacker.getName());
	                System.out.printf("%s%n%s%n%n", attacker.toString(), target.toString());
	                target.drink(RD);  // Apply RedDrug effect
	                target.drink(BD);  // Apply BlueDrug effect
	            }
	            
	            
	        }
			
			
		}
	
	}