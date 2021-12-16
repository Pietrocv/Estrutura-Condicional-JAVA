/*
Faça um programa que receba dois números e execute as operações listadas a seguir de acordo com a escolha do usuário
1 - Média entre os números  digitados
2 - Diferença do maior pelo menor
3 - Produto entre os números digitados
4 - Divisão do primeiro pelo segundo
(Se a opção digitada for inválida mostrar uma mensagem de erro e terminar a execução do programa. Lembre-se de que na
operação 4 o segundo número deve ser diferente de 0.)
 */
package me.pietro.estrutura_condicional;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float n1, n2, dif;
        int opcao;
        System.out.println("Informe o primeiro número:");
        n1 = input.nextFloat();
        System.out.println("Informe o segundo número:");
        n2 = input.nextFloat();

        System.out.println("Digite a opração desejada:\n ");
        System.out.println("[1] Média entre os números  digitados");
        System.out.println("[2] Diferença do maior pelo menor");
        System.out.println("[3] Produto entre os números digitados");
        System.out.println("[4] Divisão do primeiro pelo segundo");
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("A média entre os números  digitados: " + ((n1 + n2) / 2));
                break;
            case 2:
                if (n1 > n2)
                    dif = n1 - n2;
                else
                    dif = n2 - n1;
                System.out.println("A diferença do maior pelo menor: " + dif);
                break;
            case 3:
                System.out.println("O produto entre os números digitados: " + n1 * n2);
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("A divisão do primeiro pelo segundo: " + n1 / n2);
                } else System.out.println("O segundo número deve ser diferente de zero.");
                break;
            default:
                System.out.println("A opção está inválida, escolha uma opção válida!");
        }
    }
}
