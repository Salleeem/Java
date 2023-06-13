package Banco;

import java.util.Scanner;

import javax.swing.JOptionPane;

public abstract class Conta {
  

    int nconta;
    String nome;
    double saldo;
    
    public int getNconta() {
        return nconta;
    }
    public void setNconta(int nconta) {
        this.nconta = nconta;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    //Métodos

    public void saque(){
        double saldo;
        double vSaque=Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do saque"));

        
    }
    









    
}
