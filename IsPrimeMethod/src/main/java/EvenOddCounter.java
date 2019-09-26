
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
public class EvenOddCounter {
    public static void main(String args[])
   {
      //int number, pring and scanner
      int number;
      System.out.println("Enter an integer to check if it is odd or even: ");
      Scanner input = new Scanner(System.in);
      //number time
      number = input.nextInt();
      isOdd(number);
      //gotta have that boolean and statements from then on
      if (isOdd(number))
    {
        System.out.println("ODD");
    }
        else
    {
        System.out.println("EVEN");
    }
    }
        //get that public boolean if statement
        public static boolean isOdd(int number)
   { 
        if (number % 2 != 0)
        {
            return true;
        }
            return false;
    }
}