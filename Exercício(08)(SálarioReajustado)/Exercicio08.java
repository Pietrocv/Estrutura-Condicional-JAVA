/*
Faça um programa para calcular e mostrar o salário reajustado de um funcionário.
Sabe-se que o percentual de aumento  é o mesmo da tabela a seguir
(Até R$300,00 aumenta 35%    Acima de R$300,00 aumenta 15%).
 */
package me.pietro.estrutura_condicional;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario;

        System.out.println("Informe o salário do funcinário:");
        salario = input.nextDouble();

        if (salario <= 300.00) {
            salario = salario + salario * 0.35;
            System.out.println("O novo salário é igual a: " + salario);
        }else{
            salario = salario + salario * 0.15;
            System.out.println("O novo salário é igual a: " + salario);
        }
    }
}
