import java.util.Arrays;
import java.util.Random;

public class Array {

    public static void main(String[] args) {
        int[] arrayOfZeroTwo = new int[10];
        for (int i = 0; i < arrayOfZeroTwo.length; i++) {
            arrayOfZeroTwo[i] = new Random().nextInt(2);
        }
        System.out.println(Arrays.toString(arrayOfZeroTwo));
//        testArray();
        System.out.println(Arrays.toString(testQuiz4(arrayOfZeroTwo)));
    }


    public static void testArray() {
        /*
        What is Array?
        Array is the variable that contain set of data [String, int, double, boolean]
        Ex.
        Array of int that contain number 1, 2, 3, 4
        Array of String that contain cars
        */

        //Sample Array
        int[] number = {1, 2, 3, 4};
        String[] cars = {"Ford Ranger", "Mitsubishi", "Subaru"};

        //Sample empty array
        int[] number2 = new int[10];
        String[] cars2 = new String[3];


        // Try Print it out!
//        System.out.println(Arrays.toString(number2));


        // You can change your values through index

        System.out.println(Arrays.toString(number2));
        System.out.println(Arrays.toString(cars2));




    }

    public static void testQuiz1() {
        /*
        A)
        A.1 Build an empty arrays called pet with the size of 3
        A.2 Assign the value of your array with your 3 favorite pets
        A.3 Print out the values
        */
    }

    public static int testQuiz2(int item) {
        /*
         B) Write the program that return that values index, if none matches return 999
         Expected Output
         item = 4653
         Output: 2
         item = 314141414
         Output: 999
         */

        int[] arr1 = {6513, 6521, 4653, 1243, 6756, 8975, 2144};

        return 999;
    }

    public static int testQuiz3(int[] arrayOfZeroOne) {
        /*
         Write program that return count of all 1 in an already created array
         Expected Output
         [0,0,1,1,0,0,1,1,0,0]
         Output: 4C
         */
        return 0;
    }

    public static int[] testQuiz4(int[] arrayOfZeroOne) {
        /*
         Write program that return int[] that contain only 1 in an already created array
         Expected Output
         [0,0,1,1,0,0,1,1,0,0]
         Output: [1,1,1,1]
         */
        int[] arrayOfOne = new int[10];
        for (int i = 0; i < arrayOfZeroOne.length; i++) {
            if(arrayOfZeroOne[i] == 1) {
                arrayOfOne[i] = arrayOfZeroOne[i];
            }
        }
        return arrayOfOne;
    }
}
