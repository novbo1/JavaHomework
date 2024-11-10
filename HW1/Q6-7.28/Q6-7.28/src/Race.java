
public class Race {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create Hare and Tortise object
		Hare H = new Hare();
		Tortise T = new Tortise();
		
		//Initialize the progress line
		char[] line = new char[70];
		for(int i = 0 ; i < 70 ; i++) {
			line[i] = '_';
		}
		
		System.out.println("BANG!!!");
		System.out.println("AND THEY'RE OFF!!!!!");
		
		//Loop until someone exceeds endingSquare
		while(H.winCond() == false && T.winCond() == false) {
			try {	
				//Initialize & Replace
				line[H.getCurrentSquare()] = '_';
				line[T.getCurrentSquare()] = '_';
				//Haze and tortise moves
				H.moveSpace();
				T.moveSpace();
				//Update progress line
				if(H.getCurrentSquare() == T.getCurrentSquare()) {
					System.out.println("Ouch!");
					line[H.getCurrentSquare()] = ' ';  //If haze and tortise on same square
				}
				else {
					line[H.getCurrentSquare()] = 'H';
					line[T.getCurrentSquare()] = 'T';
				}
				//output progress line
				for(int i = 0 ; i <  70 ; i++) {
					System.out.printf("%c",line[i]);
				}
				System.out.println();
				
			}catch(ArrayIndexOutOfBoundsException e) {
				//When someone exceeds the endingSquare (more than array size)
				break;
			}
		}
		//Output winning message
		if(H.winCond() == T.winCond()) {
			System.out.println("It's tie.");
		}
		else if(H.winCond() == true) {
			System.out.println("Hare wins. Yuch.");
		}
		else {
			System.out.println("TORTISE WINS!!!");
		}
	}

}
