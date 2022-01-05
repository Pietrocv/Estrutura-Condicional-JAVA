/*
15 - Uma agência bancária possui dos tipos de investimentos, conforme o quadro a seguir.
Faça um programa que receba o tipo de investimento e o calor do investimento e que calcule
e mostre o valor corrigido de acordo com tipo de investimento.

Tipo             Descrição         Rendimento Mensal
1                Poupança                 3%
2            Fundos de renda fixa         4%
 */
package me.pietro.estrutura_condicional;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float valor;
        double aux;
        int opcao;


        System.out.println("Informe o valor a ser investido:");
        valor = input.nextFloat();

        System.out.println("Digite a opração desejada:\n ");
        System.out.println("[1] Poupança");
        System.out.println("[2] Fundos de renda fixa");
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                for(int x = 0 ; x < 12; x++){
                    aux = valor+(valor*0.03);
                    valor = (float) aux;
                }
                System.out.println("O rendimento da popuança no final de um ano é de: "+valor);
                break;
            case 2:
                for(int x = 0 ; x < 12; x++){
                    aux = valor+(valor*0.04);
                    valor = (float) aux;
                }
                System.out.println("O rendimento do fundo de renda fixa no final de um ano é de: "+valor);;
                break;
            default:
                System.out.println("Só temos essas duas opções, escolha uma que seja válida!");
        }
    }
}
