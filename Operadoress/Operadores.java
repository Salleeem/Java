package Operadoress;

public class Operadores {
    public class OperadoresDeAtribuicao {
        public static void main(String[] args) {
            System.out.println("===============================");
            int umNumero = 5;
            umNumero += 2;
            System.out.println("Resultado da adição de 5 com 2: " + umNumero);
            umNumero = 5; // Voltando o valor para 5.
            umNumero -= 2;
            System.out.println("Resultado da subtração de 5 pelo 2: "

                    + umNumero);

            umNumero = 5; // Voltando o valor para 5.
            umNumero *= 2;
            System.out.println("Resultado da multiplicação de 5 pelo 2: "

                    + umNumero);

            umNumero = 5; // Voltando o valor para 5.
            umNumero /= 2;
            System.out.println("Resultado da divisão de 5 pelo 2: "

                    + umNumero);

            umNumero = 5; // Voltando o valor para 5.
            umNumero %= 2;
            System.out.println("Resto da divisão de 5 pelo 2: " + umNumero);
            System.out.println("Fim!");
            System.out.println("===============================");
        }

    }

    public class OperadoresLogicos {
        public static void main(String[] args) {
            System.out.println("===============================");
            // Faça testes alterando o valor das quatro variáveis abaixo.
            // Lembrando, elas podem ser true ou false.
            boolean usuarioVIP = true;
            boolean compraComValorAlto = true;
            boolean menorDeIdade = true;
            boolean temProdutoAlcoolicoNoCarrinho = true;
            System.out.println("Usuário é VIP? " + usuarioVIP);
            System.out.println("A compra tem um valor alto? "
                    + compraComValorAlto);
            System.out.println("É menor de idade? " + menorDeIdade);
            System.out.println("Tem produto alcoólico no carrinho? "
                    + temProdutoAlcoolicoNoCarrinho);
            System.out.println("===============================");
            boolean aplicarDesconto = usuarioVIP && compraComValorAlto;
            System.out.println("O desconto deve ser aplicado? "
                    + "(usuarioVIP && compraComValorAlto): "
                    + aplicarDesconto);
            aplicarDesconto = usuarioVIP || compraComValorAlto;
            System.out.println("O desconto deve ser aplicado? "
                    + "(usuarioVIP || compraComValorAlto): "
                    + aplicarDesconto);
            // Leia assim: "se não for menor de idade ou se
            // não tiver produto alcoólico".
            boolean permiteConcluirCompra = !menorDeIdade || !temProdutoAlcoolicoNoCarrinho;
            System.out.println("!menorDeIdade || !temProdutoAlcoolicoNoCarrinho: " + permiteConcluirCompra);
            System.out.println("Fim!");
            System.out.println("===============================");
            System.out.println("===============================");
        }

    }

    public class OperadoresLogico {
        public static void main(String[] args) {
            System.out.println("===============================");
            // Faça testes alterando o valor das quatro variáveis abaixo.
            // Lembrando, elas podem ser true ou false.
            boolean usuarioVIP = true;
            boolean compraComValorAlto = true;
            boolean menorDeIdade = true;
            boolean temProdutoAlcoolicoNoCarrinho = true;
            System.out.println("Usuário é VIP? " + usuarioVIP);
            System.out.println("A compra tem um valor alto? "
                    + compraComValorAlto);
            System.out.println("É menor de idade? " + menorDeIdade);
            System.out.println("Tem produto alcoólico no carrinho? "
                    + temProdutoAlcoolicoNoCarrinho);
            System.out.println("===============================");
            boolean aplicarDesconto = usuarioVIP && compraComValorAlto;
            System.out.println("O desconto deve ser aplicado? "
                    + "(usuarioVIP && compraComValorAlto): "
                    + aplicarDesconto);
            aplicarDesconto = usuarioVIP || compraComValorAlto;
            System.out.println("O desconto deve ser aplicado? "
                    + "(usuarioVIP || compraComValorAlto): "
                    + aplicarDesconto);
            // Leia assim: "se não for menor de idade ou se
            // não tiver produto alcoólico".
            boolean permiteConcluirCompra = !menorDeIdade || !temProdutoAlcoolicoNoCarrinho;
            System.out.println("Pode concluir compra? "
                    + "(!menorDeIdade || !temProdutoAlcoolicoNoCarrinho): "
                    + permiteConcluirCompra);
            System.out.println("Fim!");
            System.out.println("===============================");
        }
    }

}
