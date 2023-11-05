package homework;
//Write a Java program to reverse an array of integer values.
public class Programme_3_ReverseArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        printArray(originalArray);

        int[] reversedArray = reverse(originalArray);

        System.out.println("\nReversed Array:");
        printArray(reversedArray);
    }

    public static int[] reverse(int[] array) {
        int length = array.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = array[length - 1 - i];
        }

        return reversedArray;
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }

    }
}
