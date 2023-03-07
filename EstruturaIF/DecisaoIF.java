package EstruturaIF;

import java.util.Scanner;

public class DecisaoIF {
    Scanner sc = new Scanner(System.in);

    void descontoIf() {
        System.out.println("Informe o preço do produto");
        Double valorProduto = sc.nextDouble();
        Double desconto = 0.0;
        if (valorProduto >= 100) {
            desconto = 5.0;
        }
        if (valorProduto >= 200) {
            desconto = 10.0;
        }
        if (valorProduto >= 300) {
            desconto = 15.0;
        }
        Double valorDesconto = valorProduto * desconto / 100;
        double valorFinal = valorProduto - valorDesconto;
        System.out.println("O valor do Produto é R$ " + valorFinal);

    }

    void descontoElse() {
        System.out.println("Informe o preço do produto");
        double valorProduto = sc.nextDouble();
        double desconto;
        if (valorProduto>=200){
            desconto = 10.0;
        }
        else if (valorProduto>=100){
        desconto = 5.0;}
        else {
        desconto = 0.0;
        }
        Double valorDesconto = valorProduto * desconto / 100;
        double valorFinal = valorProduto - valorDesconto;
        System.out.println("O valor do Produto é R$ " + valorFinal);
    }

}
