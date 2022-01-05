/*
Uma empresa decide aplicar descontos nos seus preços usando a tabela a seguir. Faça um programa que receba
o preço atual de um produto e seu código e que calcule e mostre o preço atual, o valor do desconto e novo preço.
Preço Atual:                    % De Desconto:
Até R$ 30,00                     Sem desconto
Entre R$ 30,00 e R$ 100,00            10
Acima de R$ 100,00                    15
 */
package me.pietro.estrutura_condicional;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double preco;

        System.out.println("Informe o preço do produto:");
        preco = input.nextDouble();

        if(preco <= 30){
            System.out.println("O produto desejado não encontra nenhum desconto, portanto o preço " +
                    "total é de: "+preco);
        }else if(preco <=100){
            System.out.println("O produto desejado possui um desconto de 10%, portanto o preço " +
                    "total é de: "+(preco-(preco*0.1)));
        }else if(preco > 100){
            System.out.println("O produto desejado possui um desconto de 15%, portanto o preço " +
                    "total é de: "+(preco-(preco*0.15)));
        }
    }
}
