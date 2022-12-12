import java.util.Arrays;
import java.util.Random;

public class MoreArrayExercise {
    public static void main(String[] args) {

        int[] arr1 = new int[50];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = new Random().nextInt(50 + 1 - 1) + 1;
        }

        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arrayOfEven(arr1)));
    }

    public static int[] arrayOfEven(int[] array) {
        int[] arrayOfEven = new int[array.length];
        int check = 0;
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                arrayOfEven[check] = array[i];
                check++;
            }
        }

        int size = 0;
        for (int i = 1; i < array.length; i++) {
            if(arrayOfEven[size] != arrayOfEven[i]) {
                arrayOfEven[++size] = arrayOfEven[i];
            }
        }

        return Arrays.copyOf(arrayOfEven, size);
    }




}
