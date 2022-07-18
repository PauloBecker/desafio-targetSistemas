
/*
Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
	a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser
	previamente definida no código;
	b) Evite usar funções prontas, como, por exemplo, reverse;
 */

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        String palavra;

        System.out.print("Informe uma string: ");
        palavra = tc.nextLine();

        String inverte = "";
        int tam = palavra.length();

        for (int i = (tam-1); i >= 0; i--) {

            inverte = inverte + palavra.charAt(i);

        }
        System.out.println(inverte);

    }
}
