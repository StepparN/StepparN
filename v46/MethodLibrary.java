
public class MethodLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println((fahrenheitToKelvin(5)));
		
		System.out.println((KelvinToCelsius(100)));
		
		System.out.println((velocityConversion(100)));
		
	   }
/**
 * Omvandlar Fahrenheit till Kelvin.
 * @param fahrenheit
 * @return
 */
    public static double fahrenheitToKelvin(double fahrenheit) {
        return  (fahrenheit + 459.67) * 5/9;
    }
/**
 * Omvandlar Kelvin till Celsius.
 * @param Kelvin
 * @return
 */
    public static double KelvinToCelsius(double Kelvin) {
        return Kelvin-273.15;
    }
/**
 * Omvandlar km/h till m/s.
 * @param velocityKmH
 * @return
 */
    public static double velocityConversion(double velocityKmH) {
        return (velocityKmH)/3.6;

    public static double kineticEnergy(double mass, double velocity) {
        
    }
            
	}

}
