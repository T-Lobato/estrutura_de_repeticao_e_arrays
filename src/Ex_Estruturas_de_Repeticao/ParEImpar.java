package Ex_Estruturas_de_Repeticao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class ParEImpar {
    public static void main(String[] args) throws Exception{
        // Objeto
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Variaveis e Entrada
        int numero;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Quantidade de números: ");
        int quantNumeros = Integer.parseInt(br.readLine());

        // Processamento
        int contador = 0;
        do{
            System.out.println("Número: ");
            numero = Integer.parseInt(br.readLine());

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            contador++;

        } while(contador < quantNumeros);

        br.close();

        // Saída
        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Ímpar: " + quantImpares);
    }
}