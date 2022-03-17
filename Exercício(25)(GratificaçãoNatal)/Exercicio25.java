/*
Uma empresa decidiu dar uma gratificação de natal aos seus funcionários, baseada no número de horas
extras e no número de horas que o funcionário faltou ao trabalho. O valor do prêmio é obtido por:
H=(número de horas extras) ⅔ *(número de horas-falta)

Salário:                             Gratificação:
Até R$ 600,00                           100,00
R$ 600,00 até R$ 1200,00                200,00
R$ 1200,00 até R$ 1800,00               300,00
R$ 1800,00 até R$ 2400,00               400,00
Acima de R$ 2400,00                     500,00

 */
package me.pietro.estrutura_condicional;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {

        int horaExtra, horaFalta, calc=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número das horas extras: ");
        horaExtra = input.nextInt();
        System.out.println("Digite o número das horas faltadas: ");
        horaFalta = input.nextInt();

        calc = horaExtra-(2*horaFalta)/3;

        if (calc>2400) {
            System.out.println("Sua gratificação será de R$500,00");
        }else if(calc>=1800){
            System.out.println("Sua gratificação será de R$400,00");
        }else if(calc>=1200){
            System.out.println("Sua gratificação será de R$300,00");
        }else if(calc>=600){
            System.out.println("Sua gratificação será de R$200,00");
        }else if(calc<600){
            System.out.println("Sua gratificação será de R$100,00");
        }
    }
}
