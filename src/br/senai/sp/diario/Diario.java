package br.senai.sp.diario;

import java.util.Scanner;

public class Diario {

    public static void main(String[] args) {
        /** Declarar as Variaveis */
        String professor;
        String diciplina;
        String nomeAluno;
        int frequencia;
        int nota1;
        int nota2;
        float media;
        String situacao;


        /** Instanciar teclado Scanner */
        Scanner teclado = new Scanner(System.in);

        /** Coleta dados  */
        System.out.println("------- Olá Prof° seja bem vindo ------- ");
        System.out.println("--------------------------------------------");
        System.out.println("Informe o seu nome: ");
        professor = teclado.nextLine();
        System.out.println("Qual é a Diciplina: ");
        diciplina = teclado.nextLine();
        System.out.println("Qual o nome o nome do Aluno: ");
        nomeAluno = teclado.nextLine();
        System.out.println("informe qual é a frequência: ");
        frequencia = teclado.nextInt();
        System.out.println("Informe a Nota 1: ");
        nota1 = teclado.nextInt();
        System.out.println("Informe a Nota 2 ");
        nota2 = teclado.nextInt();
        System.out.println("-------------------------------------------");


        /** Calcula a Média do Aluno*/

        media = ((nota1 + nota2) / 2);

        boolean avaliaProf = professor.equals("vitor");

        /** Define condição do Aluno */

        if (media >= 7 && frequencia >= 75 && !avaliaProf || media >= 6 && frequencia >= 90 && !avaliaProf ){
            situacao = "Aluno Aprovado  !!";
        } else {
            situacao = "Aluno Reprovado !!";
        }

        /** Printa as informações */
        System.out.println("--------------------------------------------");
        System.out.println("---------------- Relatorio -----------------");
        System.out.println("Olá Prof° " + professor);
        System.out.println("A Diciplina avaliada é: " + diciplina);
        System.out.println("O aluno avaliado é: " + nomeAluno);
        System.out.println("A frequência do aluno: " + frequencia);
        System.out.println("Sua nota é: " + nota1);
        System.out.println("Sua nota é: " + nota2);
        System.out.println("Sua situação é: " + situacao);
        {


        }
    }
}


