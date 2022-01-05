/*
Faça um programa que receba o salário de um funcionário e, usando a tabela a seguir, calcule e mostre
o valor do aumento e o novo sálario.
Até R$ 300,00			    50%
R$ 300,00 até R$ 500,00		40%
R$ 500,00 até R$ 700,00		30%
R$ 700,00 até R$ 800,00		20%
R$ 800,00 até R$ 1000,00    10%
Acima de R$ 1000,00		    5%
 */
package me.pietro.estrutura_condicional;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        double salario, salarioFinal;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o salário do funcinário:");
        salario = input.nextDouble();

        if (salario <= 300){
            salarioFinal = salario + salario*0.50;
            System.out.println("O valor do salário é igual a "+salario+", e o " +
                    "valor do aumento é "+(salario*0.15)+" resultando em "+salarioFinal+"");
        }
        else if(salario <= 500){
            salarioFinal = salario + salario*0.40;
            System.out.println("O valor do salário é igual a "+salario+", e o " +
                    "valor do aumento é "+(salario*0.10)+" resultando em "+salarioFinal+"");
        }
        else if(salario <=700)  {
            salarioFinal = salario + salario*0.30;
            System.out.println("O valor do salário é igual a "+salario+", e o " +
                    "valor do aumento é "+(salario*0.05)+" resultando em "+salarioFinal+"");
        }
        else if(salario <=800)  {
            salarioFinal = salario + salario*0.20;
            System.out.println("O valor do salário é igual a "+salario+", e o " +
                    "valor do aumento é "+(salario*0.05)+" resultando em "+salarioFinal+"");
        }
        else if(salario <=1000)  {
            salarioFinal = salario + salario*0.10;
            System.out.println("O valor do salário é igual a "+salario+", e o " +
                    "valor do aumento é "+(salario*0.05)+" resultando em "+salarioFinal+"");
        }
        else if(salario >1000)  {
            salarioFinal = salario + salario*0.05;
            System.out.println("O valor do salário é igual a "+salario+", e o " +
                    "valor do aumento é "+(salario*0.05)+" resultando em "+salarioFinal+"");
        }
    }
}
