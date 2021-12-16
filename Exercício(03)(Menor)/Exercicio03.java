/*
Faça um programa que receba dois números e mostre o menor.
 */
package me.pietro.estrutura_condicional;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        int n1, n2;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        n1 = input.nextInt();
        System.out.println("Digite o segundo valor:");
        n2 = input.nextInt();
        if(n1>n2)
            System.out.println("O número menor é o "+n2+"");
        else
            System.out.println("O número menor é o "+n1+"");
    }
}
