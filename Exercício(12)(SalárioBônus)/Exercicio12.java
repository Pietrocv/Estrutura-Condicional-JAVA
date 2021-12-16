/*
Faça um programa que receba o salário de um funcionário e, usando a tabela a seguir, calcule e mostre
o valor do aumento e o novo sálario.
Até R$ 350,00			    R$100,00
R$ 350,00 até R$ 600,00		R$75,00
R$ 600,00 até R$ 900,00		R$50,00
Acima de R$ 900,00		    R$35,00
 */
package me.pietro.estrutura_condicional;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario;

        System.out.println("Informe o salário do funcinário:");
        salario = input.nextDouble();

        if (salario <= 350){
            System.out.println("O valor do salário somado com o aumento é igual a "+(salario + 100));
        }
        else if(salario <= 600){
            System.out.println("O valor do salário somado com o aumento é igual a "+(salario + 75));
        }
        else if(salario <= 900)  {
            System.out.println("O valor do salário somado com o aumento é igual a " +(salario + 50));
        }
        else if(salario > 900)  {
            System.out.println("O valor do salário somado com o aumento é igual a "+(salario + 35));
        }
    }
}
