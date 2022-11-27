import java.util.stream.*;
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

    public int maxNumber(int num, int num_2, int num_3) {
        if (num >= num_2 && num >= num_3) {
            return num;
        }
        if (num_2 >= num && num_2 >= num_3) {
            return num_2;
        }
        if (num_3 >= num && num_3 >= num_2) {
            return num_3;
        }
        return num;
    }

    public int minNumber(int num, int num_2, int num_3) {
        if (num <= num_2 && num <= num_3) {
            return num;
        }
        if (num_2 <= num && num_2 <= num_3) {
            return num_2;
        }
        if (num_3 <= num && num_3 <= num_2) {
            return num_3;
        }
        return num;
    }

    public static int sumOfList(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }

    public static int sumOfListStream(int[] nums) {
        return IntStream.of(nums).sum();
    }
}
