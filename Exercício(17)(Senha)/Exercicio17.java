/*
Faça um programa que verifique a validade de uma senha fornecida pelo usuário. A senha é 4531.
O programa deve mostrar uma mensagem de permissão de acesso ou não.
 */
package me.pietro.estrutura_condicional;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int senha;

        System.out.println("Digite a senha de acesso: ");
        senha = input.nextInt();

        if(senha == 4531){
            System.out.println("Você está permitido a acessar o servidor!");
        }else{
            System.out.println("Senha Incorreta!");
        }
    }
}
