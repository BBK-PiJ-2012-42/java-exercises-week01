package exercises;

import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args) {
        int terms;
        float roughPi = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Give me a number: ");
        terms = input.nextInt();
        for(int j = 1; j == terms; j++) {
            roughPi = roughPi + ( 4/j - 4/(j+2) );
            System.out.print("With " + terms + " terms pi is " + roughPi);
        }
    }
}
