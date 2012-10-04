/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

public class exercise13 {
    public static void main(String[] args) {
        boolean prime;
        for(int i=2; i<1001; i++){
            prime = true;
            for(int j=(int) Math.sqrt(i); j>1; j--) {
                if(i%j==0) {
                    prime = false;
                }
            }
            if(prime) {
                System.out.println(i);
            }
        }
    }
}

