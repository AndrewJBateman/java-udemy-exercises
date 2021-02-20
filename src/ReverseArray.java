import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        int extent = array.length;
        System.out.println("Array = " + Arrays.toString(array));
        for(int i = 0; i < array.length; i++) {
            reversedArray[extent - 1] = array[i];
            extent -= 1;
        }
        System.out.println("Reversed array = " + Arrays.toString(reversedArray));
    }
}
