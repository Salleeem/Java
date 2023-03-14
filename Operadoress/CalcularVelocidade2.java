package Operadoress;

import java.util.Scanner;

public class CalcularVelocidade2 {
    Scanner sc = new Scanner(System.in);

    public void caclcular() {
        System.out.println("Informe a distancia percorrida");

        double distanciaPercorrida = sc.nextDouble();
        System.out.println("Informe o tempo gasto");
        double tempogasto = sc.nextDouble();
        double VelocidadeMedia = distanciaPercorrida / tempogasto;
        System.out.println("A velocidade Média é "
                + VelocidadeMedia + "KM/h");
        sc.close();

    }

    public void destino() {
        System.out.println("Informe o ponto de partida");
        String origem = sc.next();
        System.out.println("Informe o destino");
        String destino = sc.next();
        System.out.println("Sua viagem é de "
                + origem + " até " + destino);

    }
}
