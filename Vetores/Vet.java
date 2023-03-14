package Vetores;

public class Vet {
    public void ex1() {
        double[] values = new double[] { 10.5, 20.7, 30.6, 40.4, 50.5, 80.9, 11.1 };
        System.out.println("1° Posição- Índice[0]");
        System.out.println("2° Posição- Índice[1]");
        System.out.println("3° Posição- Índice[2]");
        System.out.println("4° Posição- Índice[3]");
        System.out.println("5° Posição- Índice[4]");
        System.out.println("6° Posição- Índice[5]");
        System.out.println("7° Posição- Índice[6]");
        values[0] = 15.6;
        System.out.println("1° Posição- Índice[0] " + values[0]);

    }

    public void exe2() {
        int[] newvValue = new int[5];
        newvValue[0] = 10;
        newvValue[1] = 20;
        newvValue[2] = 35;
        newvValue[3] = 67;
        newvValue[4] = 98;
        System.out.println("O vetor é: [0] = " + newvValue[0]);
        System.out.println("O vetor é: [1] = " + newvValue[1]);
        System.out.println("O vetor é: [2] = " + newvValue[2]);
        System.out.println("O vetor é: [3] = " + newvValue[3]);
        System.out.println("O vetor é: [4] = " + newvValue[4]);


    }

}
