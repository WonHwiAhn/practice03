package prob03;

public class CurrencyConverter {
	private static double rate;

	public static void setRate(double rate) {
		CurrencyConverter.rate = rate;
	}
	
	public static double toDollar( double krw ) {
		//한국돈 -> 미국돈
		if(krw < 0)
			krw = 0;
		return krw / rate;
	}
	
	public static double toKRW( double dollar ) {
		//미국돈 -> 한국돈
		if(dollar < 0)
			dollar = 0;
		return dollar * rate;
	}
	
}
