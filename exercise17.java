package exercises;

import java.util.*;

public class exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, greaterCheck, lesserCheck;
        boolean lessPrime = false, greatPrime = false;
        System.out.print("Give me a number: ");
        number = input.nextInt();
        greaterCheck = number;
        lesserCheck = number;
        while(!lessPrime && !greatPrime) {
            lesserCheck--;
            greaterCheck++;
            for(int j = (int) Math.sqrt(lesserCheck); j>1; j--) {
                if( lesserCheck % j  == 0 ) {
                        lessPrime = true;
                }
            }
            for(int j = (int) Math.sqrt(greaterCheck); j>1; j--) {
                if( greaterCheck % j  == 0 ) {
                        greatPrime = true;
                }
            }
            if ( greatPrime && lessPrime ) {
                System.out.println("The nearest primes  to " + number + " are " + lesserCheck + " and " + greaterCheck);
            }else if ( greatPrime ) {
                System.out.println("The nearest prime to " + number + " is " + greaterCheck);
            }else if ( lessPrime ) {
                System.out.println("The nearest prime to " + number + " is " + lesserCheck);
            }
        }
    }
}
