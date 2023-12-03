package project;
/*
Write a java program to find the second largest number in the array
 */
public class Task9ArraySecondLargest {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {5, 2, 8, 1, 7, 3, 9, 4, 6};

        // Find second largest
        int firstMax = numbers[0];
        int secondMax = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > firstMax) {
                secondMax = firstMax;
                firstMax = numbers[i];
            } else if (numbers[i] > secondMax && numbers[i] != firstMax) {
                secondMax = numbers[i];
            }
        }

        // Display result
        if (firstMax == secondMax) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("Second largest number: " + secondMax);
    }
}}
