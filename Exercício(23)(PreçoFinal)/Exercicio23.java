/*
Faça um programa que receba o código do produto comprado e a quantidade comprada de um produto. Calcule e mostre o preço unitário do produto comprado seguindo a tabela 1, o preço total da nota, o valor do desconto seguindo a tabela 2 e aplicado sobre o preço total da nota e o preço final da nota depois do desconto.
TABELA 1               TABELA 2
Código    Preço           Preço total              %Desconto
1 a 10    R$ 10,00        Até R$ 250,00                5%
11 a 20   R$ 15,00        Entre R$ 250 e 500           10%
21 a 30   R$ 20,00        De R$ 500,00 para cima       15%
31 a 40   R$ 30,00
 */
package me.pietro.estrutura_condicional;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigo, qnt, pt=0;

        System.out.println("Digite o código do produto comprado: ");
        codigo = input.nextInt();
        System.out.println("Digite a quantidade de produtos comprado: ");
        qnt = input.nextInt();

        if(codigo <11){
            pt=qnt*10;
        }else if(codigo<21){
            pt=qnt*15;
        }else if(codigo<31){
            pt=qnt*20;
        }else if(codigo<41){
            pt=qnt*30;
        }

        if(pt<250){
            System.out.println("O preço com o desconto de 5% é igual a: "+(pt-(pt*0.05)));
        }else if(pt<500){
            System.out.println("O preço com o desconto de 5% é igual a: "+(pt-(pt*0.10)));
        }else if(pt>500){
            System.out.println("O preço com o desconto de 5% é igual a: "+(pt-(pt*0.15)));
        }
    }
}
