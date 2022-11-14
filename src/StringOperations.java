public class StringOperations {
    public concatenateStrings(String aString, String anotherString) {
        return aString + anotherString;
    }

    // Moved to "right" context
    public static boolean doesStringContainAnother(String aString, String anotherString) {
        return aString.contains(anotherString);
    }

    public boolean doesStringContainAnother(String aString, String anotherString) {
        return aString.contains(anotherString);
    }
}