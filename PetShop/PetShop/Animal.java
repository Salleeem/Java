package JavaPt2.PetShop;

public abstract class Animal {
    String porte;
    double peso;
    String nome;
    String proprietario;

    public Animal(String porte, double peso, String nome, String especie, String proprietario) {
        this.porte = porte;
        this.peso = peso;
        this.nome = nome;
        this.proprietario = proprietario;

    }

    public Animal() {

    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
}