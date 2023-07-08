package application;

import vetores.entities.Alturas;

import java.util.Locale;
import java.util.Scanner;
/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.

 */
public class AlturasProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Alturas[] vect = new Alturas[n];

        for (int i =0; i < vect.length; i++){
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            vect[i] = new Alturas(name,age,height);
        }
        double sum = 0;
        for (int i =0; i< vect.length; i++){
            sum += vect[i].getHeight();
        }
        double avg = sum/ vect.length;
        int count =0;

        for (int i =0; i < vect.length; i++){
            if (vect[i].getAge() < 16){
                count = count+1;
            }
        }
        double percent = count * 100.0/n;
        System.out.println();
        System.out.printf("Altura média = %.2f%n", avg);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percent);

        for (int i=0; i < n;i++){
            if (vect[i].getAge() < 16){
                System.out.printf("%s%n", vect[i].getName());;
            }
        }
        sc.close();
    }
}
