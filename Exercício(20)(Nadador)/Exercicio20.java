/*
Faça um programa que receba a idade de um nadador e mostre a sua categoria usando as regras a seguir.
Categoria:                     Idade:
Infantil                       5 a 7
Juvenil                        8 a 10
Adolescente                    11 a 15
Adulto                         16 a 30
Sênior                         Acima de 30
 */
package me.pietro.estrutura_condicional;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        int idade;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a idade do nadador: ");
        idade = input.nextInt();

        if(idade >= 5 && idade <= 7){
            System.out.println("A categoria deste nadador é: Infantil");
        }else if(idade >= 8 && idade <= 10){
            System.out.println("A categoria deste nadador é: Juvenil");
        }else if(idade >= 11 && idade <= 5){
            System.out.println("A categoria deste nadador é: Adolescente");
        }else if(idade >= 16 && idade <= 30){
            System.out.println("A categoria deste nadador é: Adulto");
        }else if(idade > 30){
            System.out.println("A categoria deste nadador é: Sênior");
        }else if(idade < 5){
            System.out.println("Este nadador não tem uma categoria ainda!");
        }
    }
}
