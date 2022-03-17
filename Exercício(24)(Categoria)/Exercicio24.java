/*
Faça um programa que receba o preço, a categoria (1 - limpeza, 2-alimentação ou 3-vestuário) e a situação
(R - produtos que necessitam de refrigeração e N - produtos que não necessitam de refrigeração).
Calcule e mostre: O valor do aumento, usando as regras a seguir sobre o preço;

PREÇO          CATEGORIA       PERCENTUAL DE AUMENTO
<= R$25,00       1, 2 e 3            5%, 8% e 10%
> R$ 25,00         1, 2 e 3            12%, 15%, 18%

O valor do imposto segue usando as seguintes regras: O produto que preencher pelo menos um dos
seguintes requisitos é equivalente a 5% do preço, caso contrário pagará 8% do preço.

Os requisitos são: Categoria: 2 e Situação: R

Novo preço:                     Classificação:
Até R$ 50,00                           Barato
Entre R$50,00 e R$ 120,00              Normal
Acima de R$120,00                       Caro
 */
package me.pietro.estrutura_condicional;

import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

        int cod, cat;
        double preco;
        String sit;

        System.out.println("Informe o código do produto: ");
        cod = input.nextInt();
        System.out.println("Informe o preço do produto: ");
        preco = input.nextInt();
        System.out.println("Declare a categoria do produto, sendo elas 1 - limpeza, 2-Alimentação " +
                "ou 3-Vestuário: ");
        cat =  input.nextInt();
        System.out.println("Declare a situação do produto, R - Produtos que necessitam de refrigeração " +
                "e N - Produtos que não necessitam de refrigeração: ");
        sit =  input.next();

        if(preco <= 25 && cat == 1){
            preco += preco*0.05;
        }else if(preco <= 25 && cat == 2){
            preco += preco*0.08;
        }else if(preco <= 25 && cat == 3){
            preco += preco*0.10;
        }
        if(preco > 25 && cat == 1){
            preco += preco*0.12;
        }else if(preco > 25 && cat == 2){
            preco += preco*0.15;
        }else if(preco > 25 && cat == 3){
            preco += preco*0.18;
        }
        if(cat == 2 && sit == "R"){
            preco = preco-(preco*0.05);
        }else{
            preco = preco-(preco*0.08);
        }
        if(preco < 50){
            System.out.println("O produto é categorizado como: Barato");
        }else if(preco < 120){
            System.out.println("O produto é categorizado como: Normal");
        }else if(preco > 120){
            System.out.println("O produto é categorizado como: Caro");
        }

        System.out.println(preco);
    }
}
