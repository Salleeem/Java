package Listinha;

import java.util.Random;
import java.util.Scanner;

public class Listinha {
    Random rd = new Random(0);
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Digite o número de linhas");
        int l = sc.nextInt();
        System.out.println("Digite o número de colunas");
        int c = sc.nextInt();
        int matriz[][] = new int[l][c];
        for (int i = 0; i < l; i++) {

            for (int j = 0; j < c; j++) {
                System.out.print("| ");
                matriz[i][j] = rd.nextInt(10);
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("| ");
        }
        System.out.println();

        for (int i = 0; i < l; i++) {
            System.out.println("| ");
            for (int j = 0; j < c; j++) {
                if (i > j) {
                    matriz[i][j] = 1;
                } else if (i == j) {
                    matriz[i][j] = 0;
                } else if (j > i) {
                    matriz[i][j] = 2;
                }

                System.out.print(matriz[i][j] + " ");
            }

        }
        System.out.println("| ");
    }

    public void exercicio2() {
        int nS = rd.nextInt(1000);
        System.out.println("Tente adivinhar o número");
        int nD = sc.nextInt();
        int tentativas = 0;
        if (nS != nD) {
            while (nS != nD) {
                System.out.println("Digite outro numero");
                nD = sc.nextInt();
                tentativas++;

                if (nS > nD) {
                    System.out.println("O número digitado é maior ");
                }
                if (nS < nD) {
                    System.out.println("O número digitado é menor");
                }
                if (nS == nD) {
                    System.out.println("Parabéns você acertou em " + tentativas + " Tentativas");
                }
            }

        }

    }

    public void exercicio3() {
        int matriz[] = new int[rd.nextInt(100, 1000)];
        int cont = 0;
        int contImpar = 0;
        int contPar = 0;
        int contImparPar = 0;
        int contParImpar = 0;
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = rd.nextInt(10, 100);
        }
        for (int i = 0; i < matriz.length; i++) {
            cont++;
        }
        System.out.println("Quantidade de números: " + cont);
        System.out.println(" ");
        System.out.println("Números pares:");
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] % 2 == 0) {
                System.out.print(" " + matriz[i] + " ");
            }
            ;
        }
        System.out.println(" ");
        System.out.println("Números ímpares:");
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] % 2 > 0) {
                System.out.print(" " + matriz[i] + " ");
            }
            ;
        }
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] % 2 == 0) {
                ;
                contPar++;
            }
            ;
        }
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] % 2 > 0) {
                contImpar++;
            }
            ;
        }
        for (int i = 1; i < matriz.length; i++) {
            if (matriz[i] % 2 == 0 && (i + 1) % 2 > 0) {
                contParImpar++;
            }
            ;
        }
        for (int i = 1; i < matriz.length; i++) {
            if (matriz[i] % 2 > 0 && (i + 1) % 2 == 0) {
                contImparPar++;
            }
            ;
        }
        System.out.println(" ");
        System.out.println("Números pares: " + contPar);
        System.out.println("Números ímpares: " + contImpar);
        System.out.println(" ");
        System.out.println("Números pares em matrizes ímpares: " + contParImpar);
        System.out.println("Números ímpares em matrizes pares: " + contImparPar);

    }
}
