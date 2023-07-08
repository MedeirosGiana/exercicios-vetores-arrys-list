package application;

import java.util.Locale;
import java.util.Scanner;

public class NegativosProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("QUANTOS NÚMEROS VOCÊ VAI DIGITAR?");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("DIGITE UM NÚMERO:");
            vect[i] = sc.nextInt();
        }
        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < n; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]) ;
            }
        }

        sc.close();
    }
}
