package POOHeritage;

public class Pessoas {
    // super classe/agiota, fornece as caracteristicas/heranças,
    // atributos genéricos(comuns a todas as classes herdeiras/devedoras)

    String nome;
    String adress;
    int idade;
    String cpf;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }


    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }







    

}
