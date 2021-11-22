
public class ValueCoinTest {
	// The ValueCoinTest class contains a main method that will flip 

		public static void main(String[] args) {
			Coin dime = new Coin("Dime", 0.10);				// Creates a new coin with the properties of a dime
			Coin nickel = new Coin("Nickel", 0.05);			// Creates a new coin with the properties of a nickel
			Coin quarter = new Coin("Quarter", 0.25);		// Creates a new coin with the properties of a quarter
			double balance = 0.00;							// Double value containing the balance
			while(balance < 1.00) {							// The loop continues while the balance is less than $1.00
				dime.toss();					// Tosses the dime
				nickel.toss();					// Tosses the nickel
				quarter.toss();					// Tosses the quarter
				
				/* The next 3 if statements check if each of the 3 coins lands 
				on heads and add their value to the balance if they do land on
				heads as well as printing out the coin type added */
				
				if(dime.getSideUp() == "Heads") {	
				balance+=dime.value;
				System.out.print("\n A dime was added to the balance. \n");
				}
				if(nickel.getSideUp() == "Heads") {
				balance+=nickel.value;
				System.out.print("\n A nickel was added to the balance. \n");
				}
				if(quarter.getSideUp() == "Heads") {
				balance+=quarter.value;
				System.out.print("\n A quarter was added to the balance. \n");
				}
		}
			System.out.print("The balance is $"+balance);	// Prints out the total balance
	}

}
