package application;

import vetores.Rent;
import java.util.Scanner;

public class RentProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rent[] vect= new Rent[10];
        Rent rent = new Rent();

        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent # " + i + ":");
            System.out.print("Name:");
            sc.nextLine();
            rent.setName(sc.nextLine());
            System.out.print("Email:");
            rent.setEmail(sc.nextLine());
            System.out.print("Room:");
            int room = sc.nextInt();
            vect[room] = new Rent(rent.getName(), rent.getEmail());
        }
        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++){
           if (vect[i] != null){
               System.out.println(i + " , "+ vect[i]);
           }
        }
        sc.close();
    }
}
