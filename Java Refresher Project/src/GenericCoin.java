import java.util.*;
public class GenericCoin implements CoinInterface {
	String sideUp;
	public void toss() {	// toss randomly sets sideUp to Heads or Tails
		Random rando = new Random();	// Creates a new Random
		int chance;						// Chance determines if the coin will be heads or tails
		chance = rando.nextInt(2);		// Sets chance to be either 1 or 0
		if(chance==0) {					// If chance is 0, the coin is heads. Else if chance is 1, the coin is tails
			sideUp="Heads";
		}
		else if (chance==1) {
			sideUp="Tails";
		}
	}
	public String getSideUp() {	// getSideUp returns the value of sideUp
		return sideUp;
	}
	public GenericCoin() {	// Constructor for GenericCoin class
		toss();
		getSideUp();
	}

}