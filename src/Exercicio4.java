
/*
4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:

	SP – R$67.836,43
	RJ – R$36.678,66
	MG – R$29.229,88
	ES – R$27.165,48
	Outros – R$19.849,53

	Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro
	do valor total mensal da distribuidora.
 */

public class Exercicio4 {
    public static void main(String[] args) {


        double sp = 67.83643;
        double rj = 36.67866;
        double mg = 29.22988;
        double es = 27.16548;
        double outros = 19.84953;
        double soma = 0;

        soma = sp + rj + mg + es + outros;

        System.out.println("Total: " + soma);

        double percentualSP = ((sp / soma)*100);
        double percentualRJ = ((rj / soma)*100);
        double percentualMG = ((mg / soma)*100);
        double percentualES = ((es / soma)*100);
        double percentualOutros = ((outros / soma)*100);

        System.out.printf("Percentual SP: %.2f ",percentualSP);
        System.out.println("%");

        System.out.printf("Percentual RJ: %.2f ",percentualRJ);
        System.out.println("%");

        System.out.printf("Percentual MG: %.2f ",percentualMG);
        System.out.println("%");

        System.out.printf("Percentual ES: %.2f ",percentualES);
        System.out.println("%");

        System.out.printf("Percentual outros: %.2f ",percentualOutros);
        System.out.println("%");

    }
}
