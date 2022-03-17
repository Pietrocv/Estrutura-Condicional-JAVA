/*
Faça um programa que receba a idade e o peso de uma pessoa. De acordo com a tabela a seguir,
verifique e mostre em qual grupo de risco essa pessoa se encaixa.
							        PESO
IDADE            Até 60        Entre 61 e 90    Acima de 90
Menores de 20         9                8               7
De 20 a 50            6                5               4
Maiores de 50         3                2               1
 */
package me.pietro.estrutura_condicional;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade, peso;

        System.out.println("Digite sua idade: ");
        idade = input.nextInt();
        System.out.println("Digite seu peso: ");
        peso = input.nextInt();

        //Idades menores de 20
        if(idade <20 && peso<=60){
            System.out.println("Você faz parte do grupo de risco: 9");
        }else if(idade <20 && peso<90){
            System.out.println("Você faz parte do grupo de risco: 8");
        }else if(idade <20 && peso>90){
            System.out.println("Você faz parte do grupo de risco: 7");
        }
        //Idades entre 20 e 50
        if(idade <50 && peso<=60){
            System.out.println("Você faz parte do grupo de risco: 6");
        }else if(idade <50 && peso<90){
            System.out.println("Você faz parte do grupo de risco: 5");
        }else if(idade <50 && peso>90){
            System.out.println("Você faz parte do grupo de risco: 4");
        }
        //Idades maiores de 50
        if(idade >50 && peso<=60){
            System.out.println("Você faz parte do grupo de risco: 3");
        }else if(idade >50 && peso<90){
            System.out.println("Você faz parte do grupo de risco: 2");
        }else if(idade >50 && peso>90){
            System.out.println("Você faz parte do grupo de risco: 1");
        }
    }
}
