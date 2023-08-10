package Corsa2;


import javax.swing.JOptionPane;
import java.util.ArrayList;

class Marca {
    private String nome;

    public Marca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}

class Modelo {
    private String nome;

    public Modelo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}

class Ano {
    private int valor;

    public Ano(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}

class Cor {
    private String nome;

    public Cor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}

class Carro {
    private Marca marca;
    private Modelo modelo;
    private Ano ano;
    private Cor cor;

    public Carro(Marca marca, Modelo modelo, Ano ano, Cor cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano + "\nCor: " + cor;
    }
}

public class App {
    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<>();

        while (true) {
            String[] options = {"Cadastrar Carro", "Consultar Carro", "Excluir Carro", "Sair"};
            int choice = JOptionPane.showOptionDialog(
                null,
                "Escolha uma opção:",
                "Cadastro de Carros",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
            );

            switch (choice) {
                case 0:
                    Marca marca = new Marca(JOptionPane.showInputDialog("Digite a marca:"));
                    Modelo modelo = new Modelo(JOptionPane.showInputDialog("Digite o modelo:"));
                    Ano ano = new Ano(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:")));
                    Cor cor = new Cor(JOptionPane.showInputDialog("Digite a cor:"));

                    Carro carro = new Carro(marca, modelo, ano, cor);
                    carros.add(carro);

                    JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso!");
                    break;

                case 1: // Consultar Carro
                    StringBuilder carList = new StringBuilder("Carros cadastrados:\n\n");
                    for (Carro c : carros) {
                        carList.append(c).append("\n\n");
                    }
                    JOptionPane.showMessageDialog(null, carList.toString());
                    break;

                case 2: // Excluir Carro
                    String[] carrosArray = new String[carros.size()];
                    for (int i = 0; i < carros.size(); i++) {
                        carrosArray[i] = carros.get(i).toString();
                    }

                    String selectedCar = (String) JOptionPane.showInputDialog(
                        null,
                        "Escolha o carro a ser excluído:",
                        "Excluir Carro",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        carrosArray,
                        carrosArray[0]
                    );

                    if (selectedCar != null) {
                        for (int i = 0; i < carros.size(); i++) {
                            if (selectedCar.equals(carros.get(i).toString())) {
                                carros.remove(i);
                                JOptionPane.showMessageDialog(null, "Carro excluído com sucesso!");
                                break;
                            }
                        }
                    }
                    break;

                case 3: // Sair
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }
    }
}
