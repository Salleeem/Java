package Banco;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ContaPF clientePF[] = new ContaPF[10];
        ContaPJ clientepPj[] = new ContaPJ[10];
        boolean aberta = true;
        int contPF = 0;
        int contPJ = 0;

        while (aberta) {
            int action = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma ação"
                    + "\n 1-Criar Conta PF"
                    + "\n 2-Acessar Conta PF"
                    + "\n 3-Criar Conta PJ"
                    + "\n 4-Acessar Conta PJ "
                    + "\n 5-Sair"));

            if (action == 1) {
                clientePF[contPF] = new ContaPF();
                clientePF[contPF].setNome(JOptionPane.showInputDialog("Digite o nome do cliente"));
                clientePF[contPF].setnCPF(JOptionPane.showInputDialog("Informe o número do CPF do cliente"));
                clientePF[contPF].setSaldo(0);
                clientePF[contPF].setNconta(1000 + contPF + 1);

                contPF++;

            } else if (action == 2) {
                int nFinderPF = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta"));
                int i = 0;
                int contaAtual = 0;
                for (i = 0; i < clientePF.length; i++) {
                    if (nFinderPF == clientePF[i].getNconta()) {
                        contaAtual = i;
                        JOptionPane.showInputDialog("Cliente encontrado");
                        break;
                    }
                }
                boolean acessar = true;
                while (acessar) {
                    int segundaEtapa = Integer.parseInt(JOptionPane.showInputDialog(
                            "Informe a ação desejada"
                                    + "\n 1-Verificar saldo"
                                    + "\n 2-Fazer saque"
                                    + "\n 3-Fazer depósito"
                                    + "\n 4-Fazer Empréstimo"
                                    + "\n 5-Sair da conta"));
                    if (segundaEtapa == 1) {
                        JOptionPane.showMessageDialog(null, clientePF[contaAtual].getSaldo());
                    }
                }

            } else if (action == 3) {
                clientepPj[contPJ] = new ContaPJ();
                clientepPj[contPJ].setNome(JOptionPane.showInputDialog("Digite o nome do cliente"));
                clientepPj[contPJ].setnCNPJ(JOptionPane.showInputDialog("Informe o número do CNPJ do cliente"));
                clientepPj[contPJ].setSaldo(0);
                clientepPj[contPJ].setNconta(2000 + contPJ + 1);

                contPJ++;

            } else if (action == 4) {
                int nFinderPj = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta"));
                int i = 0;
                int contaAtual = 0;
                for (i = 0; i < clientepPj.length; i++) {
                    if (nFinderPj == clientepPj[i].getNconta()) {
                        contaAtual = i;
                        JOptionPane.showInputDialog("Cliente encontrado");
                        break;

                    }

                }
                boolean acessar = true;
                while (acessar) {
                    int segundaEtapa = Integer.parseInt(JOptionPane.showInputDialog(
                            "Informe a ação desejada"
                                    + "\n 1-Verificar saldo"
                                    + "\n 2-Fazer saque"
                                    + "\n 3-Fazer depósito"
                                    + "\n 4-Fazer Empréstimo"
                                    + "\n 5-Sair da conta"));
                    if (segundaEtapa == 1) {
                        JOptionPane.showInputDialog(null, clientepPj[contaAtual].getSaldo()

                        );
                    }
                }

            } else if (action == 5) {
                aberta = false;
            }

        }

    }

}