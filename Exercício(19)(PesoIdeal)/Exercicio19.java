/*
Faça um programa que receba a altura e o sexo de uma pessoa e que calcule e mostre seu peso
ideial, utilizando as fórmulas:
Homens: (72.7*h) - 58           Mulheres (62.1*h) - 44.7

 */
package me.pietro.estrutura_condicional;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner iput = new Scanner(System.in);

        double altura;
        String sexo;

        System.out.println("Digite o seu sexo, digitando Masculino ou Feminino: ");
        sexo = input.next();
        System.out.println("Digite a altura do indivíduo: ");
        altura = input.nextDouble();

        if(sexo == "Masculino"){
            System.out.println("O peso ideal para este indíviduo é de: "+((72.7*altura) - 58));
        }else{
            System.out.println("O peso ideal para este indíviduo é de: "+((62.1*altura) - 44.7));
        }
    }
}
