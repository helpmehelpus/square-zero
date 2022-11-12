public class AddNumbers {
    public int addIntegers(int aNumber, int anotherNumber) {
        return aNumber + anotherNumber;
    }
    public float addFloats(float aNumber, float anotherNumber) {
        return aNumber + anotherNumber;
    }

    public double addDoubles(float aDouble, float anotherDouble) {
        return aDouble + anotherDouble;
    }
    public double addIntAndDouble(int aNumber, double anotherNumber) {
        return aNumber + anotherNumber;
    }

    // Out of context
    public static boolean doesStringContainAnother(String aString, String anotherString) {
        return aString.contains(anotherString);
    }

    public static int subtractIntegers(int anInteger, int anotherInteger) {
        return anInteger - anotherInteger;
    }

    public static float subtractFloat(float aFloat, float anotherFloat) {
        return aFloat - anotherFloat;
    }

    public static double subtractDouble(double aDouble, double anotherDouble) {
        return aDouble - anotherDouble;
    }

    public double subtractIntAndDouble(int anInteger, double aDouble) {
        return anInteger - aDouble;
    }

    public double squareRoot(double aNumber) {
        double t;
        double squareRoot = aNumber / 2;
        do {
            t = squareRoot;
            squareRoot = (t + (aNumber / t)) / 2;
        } while ((t - squareRoot) >= 0.0001);
        return squareRoot;
    }
}
