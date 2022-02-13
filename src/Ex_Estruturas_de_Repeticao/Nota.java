package Ex_Estruturas_de_Repeticao;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class Nota {
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Variaveis e Entrada
        int nota;

        System.out.println("Nota: ");
        nota = sc.nextInt();

        // Processamento e Saida
        while(nota < 0 || nota > 10){
            System.out.println("Nota inválida! Digite uma nota entre 0 e 10 ");
            nota = sc.nextInt();
        }
        sc.close();
    }
}          