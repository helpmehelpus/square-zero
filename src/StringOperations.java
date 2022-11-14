public class StringOperations {
    public concatenateStrings(String aString, String anotherString) {
        return aString + anotherString;
    }

    // Moved to "right" context
    public static boolean doesStringContainAnother(String aString, String anotherString) {
        return aString.contains(anotherString);
    }

    public static boolean doesStringStartWith(String aString, String anotherString) {
        return aString.startsWith(anotherString);
    }

    public static boolean doesStringEndWith(String aString, String anotherString) {
        return aString.endsWith(anotherString);
    }
}