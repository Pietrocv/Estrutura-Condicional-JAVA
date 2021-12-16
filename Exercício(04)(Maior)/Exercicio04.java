/*
Faça um programa que receba dois números e execute as operações listadas a seguir de acordo com a escolha do usuário
1 - Média entre os números  digitados
2 - Diferença do maior pelo menor
3 - Produto entre os números digitados
4 - Divisão do primeiro pelo segundo
(Se a opção digitada for inválida mostrar uma mensagem de erro e terminar a execução do programa. Lembre-se
de que na operação 4 o segundo número deve ser diferente de 0.)
 */
package me.pietro.estrutura_condicional;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        double n1, n2;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        n1 = input.nextDouble();
        System.out.println("Digite o segundo valor:");
        n2 = input.nextDouble();
        if(n1>n2)
            System.out.println("O número maior é o "+n1+"");
        else
            System.out.println("O número maior é o "+n2+"");
    }
}
