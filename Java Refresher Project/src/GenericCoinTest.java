public class GenericCoinTest {
	// The GenericCoinTest class contains a main method that will flip 2 generic coins 50 times and track their results
	public static void main(String args[]) {
		GenericCoin coin1 = new GenericCoin();			// Initializes a new GenericCoin named coin1
		GenericCoin coin2 = new GenericCoin();			// Initializes a new GenericCoin named coin2
		int coin1Heads=0;								// Integer containing the number of times coin1 has landed on heads
		int coin2Heads=0;								// Integer containing the number of times coin2 has landed on heads
		int coin1Tails=0;								// Integer containing the number of times coin1 has landed on tails
		int coin2Tails=0;								// Integer containing the number of times coin2 has landed on tails
		for(int i=0; i<50; i++) {						// For loop that flips both coins 50 times
			coin1.toss();														// Tosses coin1
			// Checks if coin1 landed on heads or tails and increases coin1Heads or coin1Tails depending on the outcome
			if(coin1.getSideUp() == "Heads") {
				coin1Heads++;
			}
			else if(coin1.getSideUp() == "Tails") {
				coin1Tails++;
			}
			coin2.toss();								// Tosses coin2
			// Checks if coin2 landed on heads or tails and increases coin2Heads or coin2Tails depending on the outcome
			if(coin2.getSideUp() == "Heads") {
				coin2Heads++;
			}
			else if(coin2.getSideUp() == "Tails") {
				coin2Tails++;
			}
		}
		// Prints out the amount of times both coins landed on heads and tails
		System.out.print("Coins 1 and 2 were each tossed 50 times. The following is their results: \n \n");
		System.out.print("\t Coin 1 Heads: " + coin1Heads + "\n" + "\t Coin 1 Tails: " + coin1Tails + "\n");
		System.out.print("\t Coin 2 Heads: " + coin2Heads + "\n" + "\t Coin 2 Tails: " + coin2Tails + "\n");
		// Prints out which coin landed on heads more often or if neither landed on heads more than the other
		if(coin1Heads > coin2Heads) {
			System.out.print("\n Coin 1 landed on heads more");
		}
		else if(coin2Heads > coin1Heads) {
			System.out.print("\n Coin 2 landed on heads more");
		}
		else {
			System.out.print("\n Neither coin had more heads than the other");
		}
	}
}
