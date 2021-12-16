/*
11 - Faça um programa que receba o salário de um funcionário e usando a tabela a seguir calcule e
mostre o valor a receber. Sabe-se que este é composto pelo salário do funcionário acrescido de
gratificação e descontado o imposto de 7% sobre o salário sem gratificação.
Salário:                     Percentual de aumento:
Até R$ 300,00                          15%
R$ 300,00 até R$ 600,00                10%
R$ 600,00 até R$ 900,00                5%
Acima de R$ 900,00                     0%
 */
package me.pietro.estrutura_condicional;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario, salarioFinal;

        System.out.println("Informe o salário do funcinário:");
        salario = input.nextDouble();

        if (salario <= 300){
            salarioFinal = salario + salario*0.15;
            System.out.println("O valor do salário é igual a "+salario+", e o " +
                    "valor do aumento é "+(salario*0.15)+" resultando em "+salarioFinal+"");
        }
        else if(salario <= 600){
            salarioFinal = salario + salario*0.10;
            System.out.println("O valor do salário é igual a "+salario+", e o " +
                    "valor do aumento é "+(salario*0.10)+" resultando em "+salarioFinal+"");
        }
        else if(salario <=900)  {
            salarioFinal = salario + salario*0.05;
            System.out.println("O valor do salário é igual a "+salario+", e o " +
                    "valor do aumento é "+(salario*0.05)+" resultando em "+salarioFinal+"");
        }
        else if(salario >900)  {
            System.out.println("O trabalhador não tem direito a aumento!");
        }
    }
}
