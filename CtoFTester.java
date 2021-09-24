public class CtoFTester {
    public static double celsiusToFarenheit(double cDegrees) {
        return (cDegrees * (9.0 / 5)) + 32;
    }

    public static double farenheitToCelsius(double fDegrees) {
        return (fDegrees - 32) * (5.0 / 9);
    }

    public static void main(String[]args) {
        //Test Cases for C to F conversion:
        System.out.println("The values for C to F Conversion(test):");
        System.out.println(celsiusToFarenheit(0));
        System.out.println(celsiusToFarenheit(25));
        System.out.println(celsiusToFarenheit(100));

        //Test Cases for F to C conversion:
        System.out.println("The values for F to C Conversion(Test):");
        System.out.println(farenheitToCelsius(32));
        System.out.println(farenheitToCelsius(75));
        System.out.println(farenheitToCelsius(212));
    }
}
