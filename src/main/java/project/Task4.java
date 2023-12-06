package project;

public class Task4 {
    /*
    Create a 2D array of integers. Develop a program which will calculate the
sum of even and odd numbers for that array.

     */
    public static void main(String[] args) {

                // Given 2D array
                int[][] array = {
                        {1, 2, 3},
                        {4, 5, 6, 8},
                        {7, 8, 9}
                };

                int evenSum = 0;
                int oddSum = 0;

                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        if (array[i][j] % 2 == 0) {
                            evenSum += array[i][j];
                        } else {
                            oddSum += array[i][j];
                        }
                    }
                }

                // Display the array
                System.out.println("Given 2D array:");
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        System.out.print(array[i][j] + "\t");
                    }
                    System.out.println();
                }

                System.out.println("Sum of even numbers: " + evenSum);
                System.out.println("Sum of odd numbers: " + oddSum);
            }
        }






