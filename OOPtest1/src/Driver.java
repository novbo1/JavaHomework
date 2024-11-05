
public class Driver {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Warrior[] W = new Warrior[3];
		Witch[] S = new Witch[3];
		
		W[0] = new Warrior("First warrior",400,100);
		W[1] = new Warrior("Second warrior",400,100);
		W[2] = new Warrior("Third warrior",400,100);
		
		S[0] = new Witch("First witch",280,200);
		S[1] = new Witch("Second witch",280,200);
		S[2] = new Witch("Third witch",280,200);
		
		int RandomA,RandomB;
		while(true) {
			RandomA = (int)(Math.random()*3);
			RandomB = (int)(Math.random()*3);
			
			System.out.println(W[RandomA].getName()+" Was hit by "+S[RandomB].getName());
			W[RandomA].NewMoon(S[RandomB]);
			
			RandomA = (int)(Math.random()*3);
			RandomB = (int)(Math.random()*3);
			
			System.out.println(S[RandomA].getName()+" Was hit by "+W[RandomB].getName());
			S[RandomA].SmallFire(W[RandomB]);
		}
	}

}
