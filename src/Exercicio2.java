
/*
Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores
anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde,
informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado
pertence ou não a sequência.

IMPORTANTE:
	Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido
	no código;
 */

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        int n = 20;
        int vet[] = new int[n];
        int numFibo;

        System.out.print("Informe um número: ");
        numFibo = tc.nextInt();

        vet[0] = 0;
        vet[1] = 1;
        int cont = 2;
        for (int i = 2; i < n; i++) {
            cont++;
            vet[i] = vet[i - 1] + vet[i - 2];

        }

        for (int i = 0; i < n; i++) {

            System.out.print(vet[i] + " - ");

        }

        System.out.println("\n Número de iterações: " + cont);
        boolean achou = false;
        for (int j = 0; j < n; j++) {

                if (numFibo == vet[j]) {
                    achou = true;
                }

        }
        if (achou == true) {
            System.out.println("\nO número " + numFibo + " pertence a lista fibonacci ");
        } else {
            System.out.println("\nO número " + numFibo + " não pertence a lista fibonacci: ");
        }
    }
}

