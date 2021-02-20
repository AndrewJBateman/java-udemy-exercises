import java.util.Scanner;

public class MinimumElement {
    public static Scanner scanner = new Scanner(System.in);

    // constructor
    public MinimumElement() {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

    }

    private static int readInteger() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the number of elements for your array: ");
        int numberElements = scanner1.nextInt();
        return numberElements;
    }

    private static int[] readElements(int number) {
        Scanner scanner2 = new Scanner(System.in);
        int[] array = new int[number];

        for(int i = 0; i < array.length; i++) {
            array[i] = scanner2.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int minValue=array[0];

        for(int i = 0; i < array.length-1; i++) {
            if(array[i]>array[i+1]){
                if(array[i+1]<minValue)
                    minValue = array[i+1];
            }
        }
        return minValue;
    }
}
