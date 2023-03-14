package Switch;

import java.util.Scanner;

public class Exe {
    Scanner sc = new Scanner(System.in);

    public void letra() {
        System.out.println("Informe uma letra");
        String tipoLetra = "";
        String letra = sc.nextLine();
        switch (letra) {
            case "a":
                tipoLetra = "vogal";
                break;
            case "e":
                tipoLetra = "vogal";
                break;
            case "i":
                tipoLetra = "vogal";
                break;
            case "o":
                tipoLetra = "vogal";
                break;
            case "u":
                tipoLetra = "vogal";
                break;
            default:
                tipoLetra = "consoante";

        }
        System.out.println(letra + " a letra é uma " + tipoLetra);

    }

    public void mes() {
        System.out.println("Informe um número relativo a um mês");
        int num = sc.nextInt();
        String mes = "";

        switch (num) {
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
            case 7:
                mes = "Julho";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setembro";
                break;
            case 10:
                mes = "Outubro";
                break;
            case 11:
                mes = "Novembro";
                break;
            case 12:
                mes = "Dezembro";
                break;

            default:
                mes = "Esse mês não existe";
                break;
        }
        System.out.println("Corresponde ao mês de " + mes);

    }

}