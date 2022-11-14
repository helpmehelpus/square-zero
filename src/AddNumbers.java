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

    public int subtractIntegers(int anInteger, int anotherInteger) {
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

    // Another surprising addition. This one a bit more: a nested class, with unrelated functionality
//    public class StringOperations {
//        public concatenateStrings(String aString, String anotherString) {
//            return aString + anotherString;
//        }
//
//        // Moved to "right" context
//        public static boolean doesStringContainAnother(String aString, String anotherString) {
//            return aString.contains(anotherString);
//        }
//    }
}
