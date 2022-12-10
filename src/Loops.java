import java.util.Arrays;
import java.util.Random;

public class Loops {

    public static void main(String[] args) {
        // Write the program that print all values in array
        int[] number = { 123,456,789,321,543,765,987 };


        int[] randomSet = new int[5];
        for (int i = 0; i < randomSet.length; i++) {
            randomSet[i] = new Random().nextInt(randomSet.length);
        }
        System.out.println(Arrays.toString(randomSet)); // Array of random integer
    }

    public static void testQuiz1() {
        // Write program that return number 1 - 10
    }

    public static int testQuiz2(int[] randomSet) {
        /*
         Write the program that read sets of integers, then return the sum of even integer
         Expected Output
         [2,3,5,1,6]
         Output: 8
         */
        return 0;
    }
}
