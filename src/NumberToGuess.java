import java.util.Random;

public class NumberToGuess {
		private int randomNbr;
		private int min;
		private int max;
		
	/** Skapar ett objekt med ett slumpmässigt valt heltal i 
	    intervallet [min, max]. */
		
	public NumberToGuess(int min, int max) {
		this.min = min;
		this.max = max;
		Random rand = new Random();
		this.randomNbr = rand.nextInt(max-min+1) + min;
	
	}

	/** Tag reda på minsta möjliga värde talet kan ha. */
	public int getMin() {
		return this.min;
	}

	/** Tag reda på största möjliga värde talet kan ha. */
	public int getMax() {
		return this.max;
	}

	/** Tar reda på om talet är lika med guess. */
	public boolean isEqual(int guess) {
		if(this.randomNbr == guess){
			return true;
		}
		return false;
	}

	/** Tar reda på om talet är större än guess. */
	public boolean isBiggerThan(int guess) {
		if (this.randomNbr > guess){
			return true;
		}
		return false;
	}
}
