package project;

import java.util.Scanner;

/*
Create a program that uses an array to store a list of temperatures for a week,
and then uses a loop to find the highest and lowest temperature for the week
 */
public class Task1MaxMinTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declare an array to store temperatures for a week
        //int[] temperatures = new int[7];
        double[] temperatures = new double[7];

        //Enter temperatures for each day
        for(int i =0;i<temperatures.length;i++){
            System.out.println("Enter temperature for day "+(i+1)+ ":");
            temperatures[i] = sc.nextDouble();
        }
            double HighestTemperature = temperatures[0];
            double LowestTemperature =temperatures[0];

            for(int i =1;i<temperatures.length;i++){
                if(temperatures[i]>HighestTemperature){
                    HighestTemperature = temperatures[i];
                }
                if(temperatures[i]<LowestTemperature){
                    LowestTemperature = temperatures[i];
                }
            }

        System.out.println("Highest Temperature : "+HighestTemperature);
        System.out.println("Lowest Temperature  : "+LowestTemperature);

    }
}
