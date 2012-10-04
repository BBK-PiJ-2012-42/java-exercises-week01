package exercises;

public class exercise14 {
    public static void main(String[] args) {
        boolean prime;
        boolean finished = false;
        int primeCounter = 0;
        for(int i=2; !finished; i++){
            prime = true;
            for(int j=(int) Math.sqrt(i); j>1; j--) {
                if(i%j==0) {
                    prime = false;
                }
            }
            if(prime) {
                System.out.println(i);
                primeCounter++;
                if(primeCounter==1000) { finished=true; }
            }
        }
        System.out.println("Finished with " + primeCounter + " primes calculated.");
    }
}

