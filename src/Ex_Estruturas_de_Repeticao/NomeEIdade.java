package Ex_Estruturas_de_Repeticao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

public class NomeEIdade {
    public static void main(String[] args) throws Exception {

        // Objeto
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Variaveis
        String nome;
        int idade;

        //Processamento e Saída
        while(true){
            System.out.println("Nome: ");
            nome = br.readLine();

            if(nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = Integer.parseInt(br.readLine());
        }
        br.close();
        System.out.println("Programa Encerrado!");
    }
}