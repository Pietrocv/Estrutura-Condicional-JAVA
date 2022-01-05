/*
Faça um programa que receba o preço de um produto e, usando a tabela a seguir, calcule e mostre
o valor do novo preço e a classificação:

Até R$ 50,00			    5%		Até R$80,00 		        Barato
R$ 50,00 até R$ 100,00		10%		R$80,00  até R$120,00	    Normal
Acima de R$ 100,00		    15%		R$120,00  até R$200,00	    Caro
						            Maior que R$200,00	        Muito Caro
 */
package me.pietro.estrutura_condicional;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        double precoproduto, precofinal=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o preço do produto:");
        precoproduto = input.nextDouble();

        if (precoproduto <= 50){
            precofinal = precoproduto + precoproduto*0.05;
            System.out.println("O preço do produto é igual a "+precoproduto+", e o " +
                    "valor do aumento é "+(precoproduto*0.05)+" resultando em "+precofinal+"");
        }
        else if(precoproduto <= 100){
            precofinal = precoproduto + precoproduto*0.10;
            System.out.println("O preço do produto é igual a "+precoproduto+", e o " +
                    "valor do aumento é "+(precoproduto*0.10)+" resultando em "+precofinal+"");
        }
        else if(precoproduto > 100){
            precofinal = precoproduto + precoproduto*0.15;
            System.out.println("O preço do produto é igual a "+precoproduto+", e o " +
                    "valor do aumento é "+(precoproduto*0.15)+" resultando em "+precofinal+"");
        }
        if(precofinal<=80){
            System.out.println("O preço está Barato");
        }
        else if(precofinal<=120){
            System.out.println("O preço está Normal");
        }
        else if(precofinal<=200){
            System.out.println("O preço está Caro");
        }
        else if(precofinal>200){
            System.out.println("O preço está Muito Caro");
        }
    }
}
