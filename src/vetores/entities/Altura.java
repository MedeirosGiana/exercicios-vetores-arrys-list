package vetores.entities;

import java.util.Locale;
import java.util.Scanner;

//fazer um programa para ler um número inteiro N e a altura de N pessoas.
// Armazene as N alturas em um vertor, mostrar a altura média dessas pessoas.
public class Altura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        double[] vect = new  double[n];//declarando o vetor que vai armazenar n

        for (int i = 0; i < n; i++){//armazenando as alturas em um vetor
            vect[i] = sc.nextDouble();
        }
        double sum = 0.0;//declarando a soma iniciada em 0

        for (int i = 0; i < n; i++){//para guardar a soma do vetor:
            sum += vect[i];
        }
        double avg = sum / n;//calculando a media da altura de n pessoas
        System.out.printf("Average Hight: %.2f%n ", + avg);//altura media

        sc.close();//fechando o scanner
    }

}
