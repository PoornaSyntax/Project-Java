package project;

import java.util.Scanner;

public class Task6PrimeNumber {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number to check if it is prime or not");
        int num = sc.nextInt();

        if(num==2){
            System.out.println(num+ " is a prime number");
        }else {
            //checking number of factors
            for(int i = 1; i<=num;i++){
                if(num%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(num+ " is a prime number");
            }else {
                System.out.println(num+" is not a prime number");
            }
        }

    }
}
