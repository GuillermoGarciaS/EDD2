package Modulo_3.Pruebas;

import java.util.Scanner;

public class rank {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        
        int N = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        scanner.close();

        if (N > 5 || N < 2) {
                
            System.out.println("Not Weird");
            
        } else if (N >= 6|| N <= 20) {
            
        }
    }
    
}
