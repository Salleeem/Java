package POOIntroducao;

public class RegistraAluno {

    private String nome;
    private String endereco;
    private int idade;
    private double notaPt;
    private double notaMat;
    private double notaCie;
    private static int contadorEstudante;

    public String getNome() {
        return nome;
    }

    public String getAdress() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    public double getPt() {
        return notaPt;
    }

    public double getMat() {
        return notaMat;
    }

    public double getCie() {
        return notaCie;
    }

    public double getMedia() {
        double resultado = 0;
        resultado = (notaMat
                + notaPt
                + notaCie) / 3;
        return resultado;
    }

    public static int getQuantiaAlunos() {
        return contadorEstudante;
    }

    public void setNome(String temp) {
        nome = temp;
    }

    public void setAdress(String temp) {
        endereco = temp;
    }

    public void setIdade(int temp) {
        idade = temp;
    } 

    public void setNotaMat(double temp) {
        notaMat = temp;
    }

    public void setNotaPt(double temp) {
        notaPt = temp;
    }

    public void setNotaCie(double temp) {
        notaCie = temp;
    }

}