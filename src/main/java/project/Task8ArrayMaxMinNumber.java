package project;

public class Task8ArrayMaxMinNumber {
    /*
      Maximum and minimum number in the array?
     */

    public static void main(String[] args) {

        int[] numbers = {5, 2, 8, 1, 7, 3, 9, 4, 6};

        // Find maximum and minimum
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Display results
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
