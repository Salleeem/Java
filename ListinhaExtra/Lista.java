package ListinhaExtra;

import java.util.Scanner;

public class Lista {
    Scanner sc = new Scanner(System.in);
    double num;

    public void Task1() {
        System.out.println("Informe um número");
        num = sc.nextDouble();
        if (num % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }

    }

     public void Task2(){

        System.out.println("Informe sua nota");
        int nota = sc.nextInt();

        if (nota == 5) { System.out.println("O aluno está reprovado");
        }
        if (nota >= 8 ) { System.out.println("O aluno está aprovado");
            
        } else { System.out.println("O aluno tem direito a recuperação");
            
        }
        }




    





    public void Task3() {
        System.out.println("Digite uma letra");
        String letrinha = sc.nextLine();
        char io = A;
        if (io == 'a' || io == 'e' || io == 'i' || io == 'o'
                || io == 'u')
            System.out.println("A letra é uma vogal");
        else
            System.out.println("A letra é uma consoante");
    }

}
