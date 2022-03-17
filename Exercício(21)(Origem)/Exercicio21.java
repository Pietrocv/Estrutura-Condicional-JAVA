/*
21 - Faça um programa que receba o preço de um produto, um produto e o seu código de origem e mostre a sua procedência. A procedência da tabela a seguir.
Código de Origem:              Procedência:
1                                  Sul
2                                 Norte
3                                 Leste
4                                 Oeste
5 ou 6                           Nordeste
7 ou 8 ou 9                      Sudeste
10 a 20                        Centro-Oeste
21 a 30            		         Noroeste
 */
package me.pietro.estrutura_condicional;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        int codigo;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o código do produto: ");
        codigo = input.nextInt();

        if(codigo == 1){
            System.out.println("A procedência deste produto é do: Sul");
        }else if(codigo == 2){
            System.out.println("A procedência deste produto é do: Norte");
        }else if(codigo == 3){
            System.out.println("A procedência deste produto é do: Leste");
        }else if(codigo == 4){
            System.out.println("A procedência deste produto é do: Oeste");
        }else if(codigo == 5 || codigo == 6 ){
            System.out.println("A procedência deste produto é do: Nordeste");
        }else if(codigo == 7 || codigo == 8 || codigo == 9 ){
            System.out.println("A procedência deste produto é do: Sudeste");
        }else if(codigo >=10 && codigo <= 20){
            System.out.println("A procedência deste produto é do: Centro-Oeste");
        }else if(codigo >=21 && codigo <= 30){
            System.out.println("A procedência deste produto é do: Noroeste");
        }
    }
}
