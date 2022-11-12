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
}
