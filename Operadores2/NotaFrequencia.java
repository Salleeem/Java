package Operadores2;

import java.util.Scanner;

/**
 * NotaFrequencia
 */
public class NotaFrequencia {
    Scanner sc = new Scanner(System.in);

    void calcular() {
        System.out.println("Informe a nota 1 do aluno");
        int nota1 = sc.nextInt();
        System.out.println("Informe a nota 2 do aluno");
        int nota2 = sc.nextInt();
        Double mediaAluno = (double) (nota1 + nota2 / 2);
        System.out.println("A média do aluno é " + mediaAluno);
        Boolean mediaAprovada = mediaAluno >= 5;
        System.out.println("O aluno está aprovado por nota? " + mediaAprovada);
        System.out.println("Informe a frequêcia do aluno");
        int frequenciaAluno = sc.nextInt();
        Boolean frequenciaAprovada = frequenciaAluno >= 75;
        System.out.println("O aluno está aprovado por Frequência? " + frequenciaAprovada);
        Boolean resultadoFinal = (mediaAprovada == true) && (frequenciaAprovada == true);
        System.out.println("O aluno esta aprovado no curso? " + resultadoFinal);
    }
}