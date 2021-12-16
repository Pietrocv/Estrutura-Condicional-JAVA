/*
Faça um programa que receba duas notas, calcule e mostre a média aritmética e a mensagem que está na tabela a seguir:
Média Aritmética:                      Mensagem:
0,0 ------ 4,0                         Reprovado
4,0 ------ 7,0                         Exame
7,0 ------ 10,0                        Aprovado
 */
package me.pietro.estrutura_condicional;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        float n1, n2, mediaAritmetica;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        n1 = input.nextFloat();
        System.out.println("Digite a segunda nota:");
        n2 = input.nextFloat();

        mediaAritmetica = (n1+n2)/2;
        if(mediaAritmetica<4) {
            System.out.println("O aluno está reprovado, e sua média é " + mediaAritmetica);
        }else if(mediaAritmetica>=4 && mediaAritmetica<7) {
            System.out.println("O aluno terá de refeazer o exame, e sua média é igual a " + mediaAritmetica);
        }else if(mediaAritmetica>=7){
            System.out.println("O aluno está aprovado, e sua média é igual a "+mediaAritmetica);
        }
    }
}
