package Ex_Estruturas_de_Repeticao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class MaiorEMedia {
    public static void main(String[] args) throws Exception{
        // Objeto
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Variaveis
        int numero;
        int maior = 0;
        int soma = 0;
        int contador = 0;

        // Processamento
        do {
            System.out.println("Número: ");
            numero = Integer.parseInt(br.readLine());
            soma += numero;

            if (numero > maior) maior = numero;

            contador++;

        } while(contador < 5);

        br.close();

        // Saída
        System.out.println("Maior: " + maior);
        System.out.println("Média: " + soma/5);
    }
}