/*
Um banco concederá um crédito especial aos seus clientes de acordo com o saldo médio no último ano.
Faça um programa que receba o saldo médio de um cliente e calcule o valor do crédito, de acordo com
a tabela a seguir. Mostre o saldo médio e o valor do crédito.

Acima de R$ 400,00		    30% do saldo médio
R$ 400,00 até R$ 300,00	    25% do saldo médio
R$ 300,00 até R$ 200,00	    20% do saldo médio
Até R$ 200,00			    10% do saldo médio
 */
package me.pietro.estrutura_condicional;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        double saldoMedio, credito, salarioFinal=0;
        int n = 12;
        double salar[] = new double[n];

        Scanner input = new Scanner(System.in);

        for(int i=0; i<12; i++){
            System.out.println("Informe o "+(1+i)+"ª salário do cliente:");
            salar[i] = input.nextDouble();
            salarioFinal+=salar[i];
        }

        saldoMedio = salarioFinal/12;

        if (saldoMedio <= 200){
            credito = saldoMedio*0.10;
            System.out.println("O valor do saldo médio é igual a "+saldoMedio+", e o " +
                    "valor do crédito " + "é igual a "+credito+"");
        }
        else if(saldoMedio <= 300){
            credito = saldoMedio*0.20;
            System.out.println("O valor do saldo médio é igual a "+saldoMedio+", e o " +
                    "valor do crédito " + "é igual a "+credito+"");
        }
        else if(saldoMedio <=400)  {
            credito = saldoMedio*0.25;
            System.out.println("O valor do saldo médio é igual a "+saldoMedio+", e o " +
                    "valor do crédito " + "é igual a "+credito+"");
        }
        else if(saldoMedio >400)  {
            credito = saldoMedio*0.30;
            System.out.println("O valor do saldo médio é igual a "+saldoMedio+", e o " +
                    "valor do crédito " + "é igual a "+credito+"");
        }
    }
}

