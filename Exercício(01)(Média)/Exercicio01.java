/*
Faça um programa que receba quartro notas de um aluno, calcule e mostre a média aritimética
das notase a mensagem de aprovado ou reprovado, considerando para aprovação a média 7.
*/
package me.pietro.estrutura_condicional;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, n3, n4, mediaAritmetica;

        System.out.println("Digite o primeiro valor");
        n1 = input.nextInt();
        System.out.println("Digite o segundo valor:");
        n2 = input.nextInt();
        System.out.println("Digite o terceiro valor");
        n3 = input.nextInt();
        System.out.println("Digite o quarto valor:");
        n4 = input.nextInt();
        mediaAritmetica = (n1+n2+n3+n4)/4;
        if (mediaAritmetica >= 7){
            System.out.println("Aluno Aprovado, sua média é igual a "+mediaAritmetica);
        }else{
            System.out.println("Aluno reprovado, sua média é igual a "+mediaAritmetica);
        }
    }
}
