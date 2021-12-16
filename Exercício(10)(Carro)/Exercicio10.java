/*
O custo ao consumidor de um carro novo é a soma do custo de fábrica com a porcentagem do distribuidor e com os
impostos, ambos aplicados ao custo de fábrica. Sabe-se que as porcentagens são as mesmas que estão na tabela a seguir.
Faça um programa que receba o custo de fábrica de um carro e mostre o custo ao consumidor.
Custo de Fábrica			%Do Distribuidor      %Dos Impostos
Até R$12.000,00				        5		            0
Entre R$12.000,00 e R$25.000,00		10		            15
Acima de R$25.000,00 				15   		        20
 */
package me.pietro.estrutura_condicional;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double precoCarro;

        System.out.println("Informe o valor do preço do carro: ");
        precoCarro = input.nextDouble();
        if (precoCarro <= 12000){
            precoCarro += precoCarro*0.05;
            System.out.println("O valor final do carro é igual a: "+precoCarro);
        }
        else if(precoCarro <= 25000){
            precoCarro += precoCarro*0.10 + precoCarro*0.15;
            System.out.println("O valor final do carro é igual a: "+precoCarro);
        }
        else if(precoCarro > 25000)  {
            precoCarro += precoCarro*0.15 + precoCarro*0.20;
            System.out.println("O valor final do carro é igual a: "+precoCarro);
        }
    }
}
