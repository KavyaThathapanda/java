
public class TemperatureConverterApp {

	public static void main(String[] args) {
		
		TemperatureConverter temp = new TemperatureConverter();
		double res = temp.convertFahrenheitToCelsius(68.0);
		System.out.printf("%.2f",res);
	}
}
