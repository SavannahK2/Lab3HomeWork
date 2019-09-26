
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0786954
 */
public class IsPrimeMethod {
    public static void main(String[] args) {
        //User input
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        //add int and star if else
        int n = s.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
    } 
        else 
    {
        System.out.println(n + " is not a prime number.");
    }
    }
        //Add boolean and if statements
        public static boolean isPrime(int n) {
        if (n <= 1) 
    {
        return false;
    }
        for (int i = 2; i < Math.sqrt(n); i++) {
        if (n % i == 0) {
        return false;
    }
    }
        return true;
    }
    }