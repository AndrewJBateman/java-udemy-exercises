import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    // constructor
    public SortedArray() {
        // get array of numbers from user input function getIntegers()
        int[] myIntegers = getIntegers(5);
        printArray(sortIntegers(myIntegers));
    }


    // get array of numbers to work with
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[number];
        for (int i=0; i<number; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // sort array of numbers in descending order
    public static int[] sortIntegers(int[] array) {
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false ;
            for (int i = 0; i < arrayCopy.length-1; i++){
                if (arrayCopy[i] < arrayCopy[i+1]) {
                    temp = arrayCopy[i];
                    arrayCopy[i] = arrayCopy[i+1];
                    arrayCopy[i+1] = temp;
                    flag = true;
                }
            }
        }
        return arrayCopy;
    }

    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}


