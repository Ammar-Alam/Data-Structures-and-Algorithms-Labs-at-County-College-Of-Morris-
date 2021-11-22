
public class Coin extends GenericCoin {
	public double value;
	public String type;
	public Coin() {						// No args constructor for Coin
		super();
		value = 0;
		type = "";
	}
	public Coin(String newType, double newValue) {	// Constructor for coin that sets the type and value of the new coin
		super();
		value = newValue;
		type = newType;
	}

}
