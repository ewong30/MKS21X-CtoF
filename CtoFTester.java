public class CtoFTester {
    public static double celsiusToFarenheit(double cDegrees) {
        return (cDegrees * (9/5)) + 32;
    }

    public static double farenheitToCelsius(double fDegrees) {
        return ((fDegrees - 32) * (5/9));
    }
}
