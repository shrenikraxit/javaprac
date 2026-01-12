package fundamentals.arrays;
public class ArrayEx1 {

    public static void main(String args[]) {


        int[] primes= new int[20];
        int[] even=new int[5];
        primes[0] = 2;
        primes[1] = 3;
        int[] primes2 = primes;
        System.out.println(primes2[0]);
        primes2[0] = 5;
        System.out.println(primes[0]);
        int[] score = new int[9];
        byte[] values = new byte[10];

        for (int a : score) {
            System.out.println(score[a]);
        }
        
        for (byte b : values) {
            values[b] = 1;
            System.out.println(values[b]);
        }

  
    }

}
