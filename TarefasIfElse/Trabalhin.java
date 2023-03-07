package TarefasIfElse;

import java.util.Scanner;

public class Trabalhin {
    Scanner sc = new Scanner(System.in);

    public void One() {
        System.out.println("Informe um número");
        int first = sc.nextInt();
        System.out.println("informe outro número");
        int second = sc.nextInt();
        if (second > first) {
            System.out.println("Esse é maior número " + second);
        } else {
            System.out.println("Esse é o maior número " + first);
        }
    }

    public void Two() {
        System.out.println("Informe o ano do seu nascimento");
        int age = sc.nextInt();
        int minimum = 2007;
        if (age <= minimum) {
            System.out.println("Você poderá votar esse ano");
        } else {
            System.out.println("Você não podera votar esse ano");
        }

    }

    public void Three() {
        System.out.println("Informe sua senha");
        int pass = sc.nextInt();
        int correct = 1234;
        if (pass == correct) {
            System.out.println("Acesso garantido");
        }
        System.out.println("Acesso negado");

    }

    public void Four() {
        System.out.println("Informe a quantidade de maças");
        Double apple = sc.nextDouble();
        Double value = 0.0;
        if (apple <= 12) {
            value = 0.30;
        }
        if (apple > 12) {
            value = 0.25;
        }

        double valorFinal = apple * value;
        System.out.println("A compra será de R$ " + valorFinal);

    }

    public void Five() {
        System.out.println("Infomer o primeiro numero: ");
        double n1 = sc.nextDouble();
        System.out.println("Infomer o segundo numero: ");
        double n2 = sc.nextDouble();
        System.out.println("Infomer o terceiro numero: ");
        double n3 = sc.nextDouble();
        double maior = 0;
        double menor = 0;
        double meio = 0;
        if (n1 > n2 && n1 > n3 && n2 > n3) {
            maior = n1;
            meio = n2;
            menor = n3;
        }
        if (n2 > n1 && n2 > n3 && n1 > n3) {
            maior = n2;
            meio = n1;
            menor = n3;
        }
        if (n1 > n2 && n1 > n3 && n3 > n2) {
            maior = n1;
            meio = n3;
            menor = n2;
        }
        if (n2 > n3 && n2 > n1 && n3 > n1) {
            maior = n2;
            meio = n3;
            menor = n1;
        }
        if (n3 > n1 && n3 > n2 && n2 > n1) {
            maior = n3;
            meio = n2;
            menor = n1;
        }
        if (n3 > n1 && n3 > n2 && n1 > n2) {
            maior = n3;
            meio = n1;
            menor = n2;
        }
        System.out.println("Maior: " + maior + " Meio: " + meio + " Menor: " + menor);
    }

    public void Six() {
        System.out.println("Informe seu gênero");
        String gender = sc.nextLine();
        String male = "homem";
        String fem = "mulher";
        double weight;
        System.out.println("Informe sua altura");
        double height = sc.nextDouble();
        if (gender.equals(male)) {
            weight = height * 72.7 - 58;
            System.out.println("Esse é seu peso ideal " + weight);
        }
        if (gender.equals(fem)) {
            weight = 62.1 * height - 44.7;
            System.out.println("Esse é seu peso ideal " + weight);
        }
    }

    public void Seven(){
            System.out.println("Informe a primeira nota");
            int nota1 = sc.nextInt();
            System.out.println("Informe a segunda nota");
            int nota2 = sc.nextInt();
            double media = (nota1+nota2)/2;
            System.out.println("A media do aluno é "+ media);
            double m = 50;
            if(media >= m){
                System.out.println("O aluno está aprovado por nota");
            }else{
                System.out.println("O aluno está reprovado por nota");
            }
            System.out.println("Informe a Frequência do Aluno");
            int frequência = sc.nextInt();
            double frequência1 = 75;
            if(frequência >= frequência1){
                System.out.println("O aluno está aprovado por frequência");
            }else{
                System.out.println("O aluno está reprovado por frequência");
            }
            if(m >= media && frequência >= frequência1){
                System.out.println("O aluno esta aprovado");
            }else{
                System.out.println("O aluno esta reprovado");
            }
        }


    }

