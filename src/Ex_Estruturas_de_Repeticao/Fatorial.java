package Ex_Estruturas_de_Repeticao;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Fatorial {
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Variaveis e Entrada
        System.out.println("Fatorial: ");
        int fatorial = sc.nextInt();
        sc.close();

        int multiplicacao = 1;

        // Processamento
        System.out.print(fatorial +"! = ");
        for(int i = fatorial; i > 0 ; i--) {
            multiplicacao = multiplicacao * i;
        }
        //Saida
        System.out.println(multiplicacao);
    }
}