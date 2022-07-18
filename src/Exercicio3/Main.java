package Exercicio3;

/*
Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
	• O menor valor de faturamento ocorrido em um dia do mês;
	• O maior valor de faturamento ocorrido em um dia do mês;
	• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:
	a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
	b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;
 */

import com.sun.jdi.Value;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        int n = 30;
        Double vet[] = { 22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612,0.0,42889.2258,46251.174, 11191.4722,0.0, 0.0, 3847.4823,
                373.7838,2659.7563, 48924.2448,18419.2614,0.0,0.0,35240.1826, 43829.1667, 18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 8414.61};
        int soma = 0;
        Double menorValor = Double.MAX_VALUE;
        Double maiorValor = Double.MIN_VALUE;


        int cont = 0;

        System.out.println(" ==== Faturamento diário ===== ");
        for (int i = 0; i < n; i++) {
            if (vet[i] != 0.0){

                soma += vet[i];
                cont++;

                System.out.println("Faturamento dia " + (i+1) + " :" + vet[i]);
            }else {
                System.out.println("No dia " + (i+1) + " não teve faturamento.");
            }
            if (vet[i] < menorValor){
                menorValor = vet[i];
            } else if (vet[i] > maiorValor) {
                maiorValor = vet[i];
            }
        }

        double media = 0;
        media = soma/cont;

        System.out.println("Soma faturamento: " + soma);
        System.out.printf("Média faturamento: %.2f ", media);


        System.out.println("\n ===== Dias no mês em que o valor de faturamento diário foi superior à média mensal ===== ");
        for (int i = 0; i < n; i++) {

            if (vet[i] > media){
                System.out.println("Dia " + (i+1) + " :" + vet[i]);
            }

        }
    }

}
