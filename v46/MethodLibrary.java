
public class MethodLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println((fahrenheitToKelvin(5)));
		
		System.out.println((KelvinToCelsius(100)));
		
		System.out.println((velocityConversion(100)));
		
		System.out.println((kineticEnergy(5, 5)));
		
		System.out.println((potentialEnergy(2, 5)));
		
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
    }
/**
 * Räknar ut kinetisk energi med massa och hastighet.
 * @param mass
 * @param velocity
 * @return
 */
    public static double kineticEnergy(double mass, double velocity) {
    	return (mass*velocity*velocity/2);
    }
/**
 * Räknar ut potentiell energi med massa och höjd.
 * @param mass
 * @param height
 * @return
 */
    public static double potentialEnergy(double mass, double height) {
    	return (mass*9.82*height);
    }
    
    double delta(double first, double second, double last) {
    

            
	}

}
