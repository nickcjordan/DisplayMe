package displayme.app.crypto;

import java.util.HashMap;
import java.util.List;

public class CryptoInfo {

	List<Currency> coins;
	double valueSum;
	
	public List<Currency> getCoins() {
		return coins;
	}
	public void setCoins(List<Currency> coins) {
		this.coins = coins;
	}
	public double getValueSum() {
		return valueSum;
	}
	public void setValueSum(double valueSum) {
		this.valueSum = valueSum;
	}
	
	
}
