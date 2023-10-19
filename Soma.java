package SomaNumeroImpares;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo: ");
        int n = scanner.nextInt();

        int soma = 0;
        int numeroImpar = 1;

        for (int i = 0; i < n; i++) {
            soma += numeroImpar;
            numeroImpar += 2; // Proximo numero impar
        }

        System.out.println("A soma dos primeiros " + n + " numeros impares e: " + soma);

        scanner.close();
    }
}
