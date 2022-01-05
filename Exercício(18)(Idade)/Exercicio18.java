/*
Faça um programa que receba a idade de uma pessoa e mostre a mensagem de maioridade ou não.
 */
package me.pietro.estrutura_condicional;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;

        System.out.println("Digite a idade desejada: ");
        idade = input.nextInt();

        if(idade == 18){
            System.out.println("Maior Idade!");
        }else{
            System.out.println("Menor Idade!");
        }
    }
}
