import java.util.Scanner;


public class GuessThatNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int guess = Integer.MIN_VALUE;
		int nbrGuess = 0;

		System.out.println("Skriv det lägsta värdet som skall gälla");
		int min = scan.nextInt();
		
		System.out.println("Bra. Det lägsta värdet är "+min+". Ange nu det högsta värdet.");
		int max = scan.nextInt();
		
		NumberToGuess number = new NumberToGuess(min, max);
		
		while ( !number.isEqual( guess )){
			
			System.out.println("Gissa nu på ett tal mellan "+min+" och "+max+".");
			guess = scan.nextInt();
			
			nbrGuess = nbrGuess +1;
			
			if(number.isBiggerThan(guess)){
				System.out.println("Gissa på ett tal högre än "+guess+".");
			} else if (number.isEqual(guess)){
				System.out.println("Du gissade rätt!");
			} else {
				System.out.println("Gissa på ett tal lägre än "+guess+".");
				
			}
		}
		if (nbrGuess == 1){
			System.out.println("Det krävdes "+nbrGuess+" gissning.");
		}
		if (nbrGuess !=1){
			System.out.println("Det krävdes "+nbrGuess+" gissningar.");
		}
			
	}


}
