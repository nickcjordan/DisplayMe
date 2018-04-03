package displayme.app.crypto;

import java.util.Comparator;

public class CryptoValueComparator implements Comparator<Currency> {

	@Override
	public int compare(Currency c1, Currency c2) {
		return new Double(c2.getCurrentValueUSD()).compareTo(new Double(c1.getCurrentValueUSD()));
	}

}
