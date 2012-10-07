package exercises;

import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args) {
        int terms, count;
        double multiple, roughPi = 0, tenPi = 3.14159265358;
        Scanner input = new Scanner(System.in);
        System.out.print("Give me a number: ");
        terms = input.nextInt();
        count = 0;
        for(int j = 1; j <= terms; j++) {
            multiple = count * 4 + 1;
            //System.out.println(multiple);
            roughPi = roughPi + ( 4/multiple - 4/(multiple+2) );
            System.out.println("With " + j + " terms pi is " + roughPi);
            count++;
        }
    }
}
