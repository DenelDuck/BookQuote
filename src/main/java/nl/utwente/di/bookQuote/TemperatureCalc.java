package nl.utwente.di.bookQuote;

public class TemperatureCalc {

	public TemperatureCalc() {
		
	}

	public double toFahrenheit(String celsius) {
		double parsedDouble;
		try {
			parsedDouble = Double.parseDouble(celsius);
		} catch (NumberFormatException e) {
			return 0;
		}
		return (parsedDouble * 1.8) + 32;
	}

}
