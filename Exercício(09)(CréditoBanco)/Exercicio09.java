/*
Um banco concederá um crédito especial aos seus clientes de acordo com o saldo médio no último ano.
Faça um programa que receba o saldo médio de um cliente e calcule o valor do crédito, de acordo com
a tabela a seguir. Mostre o saldo médio e o valor do crédito.
Acima de R$ 400,00		30% do saldo médio
R$ 400,00 até R$ 300,00	25% do saldo médio
R$ 300,00 até R$ 200,00	20% do saldo médio
Até R$ 200,00			10% do saldo médio
 */
package me.pietro.estrutura_condicional;

import java.util.Scanner;

public class Exercicio09 {

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
