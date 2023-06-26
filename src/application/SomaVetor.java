package application;

import java.util.Locale;
import java.util.Scanner;
/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
 */
public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i =0; i < n; i++){
            System.out.print("Digite um numero:");
            vect[i] = sc.nextDouble();
        }
        double sum = 0;

        for (int i =0; i < n; i++){
            sum += vect[i];
        }
        double avg = sum/n;

        System.out.print("VALORES = ");
        for (int i =0; i < n; i++){
            System.out.printf("%.1f ", vect[i]);
        }
        System.out.printf("Soma = %.2f %n", sum);
        System.out.printf("Média = %.2f", avg);

        sc.close();
    }
}
