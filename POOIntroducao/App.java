package POOIntroducao;

public class App {

    public static void main(String[] args) {

        RegistraAluno aln1 = new RegistraAluno();
        RegistraAluno aln2 = new RegistraAluno();

        // Aluno 1
        aln1.setNome("Ana Carla Pereira");
        System.out.println("Nome: " + aln1.getNome());

        aln1.setIdade(16);
        System.out.println("Idade " + aln1.getIdade());

        aln1.setAdress("Av. Eng. Antônio Francisco de Paula Souza, 3423 - Jardim São Vicente, Campinas - SP");
        System.out.println("Endereço: " + aln1.getAdress());

        aln1.setNotaCie(7);
        System.out.println("Nota Ciências: " + aln1.getCie());

        aln1.setNotaMat(8);
        System.out.println("Nota Matemática: " + aln1.getMat());

        aln1.setNotaPt(6);
        System.out.println("Nota Português: " + aln1.getPt());

        System.out.println("Sua média é de: " + aln1.getMedia());

        System.out.println("------------------------------------------");

        // Aluno 2
        aln2.setNome("Francisco Enzo de Campos");
        System.out.println("Nome: " + aln2.getNome());

        aln2.setIdade(17);
        System.out.println("Idade " + aln2.getIdade());

        aln2.setAdress("Av. Barão de Itapura, 2142 - Guanabara, Campinas");
        System.out.println("Endereço: " + aln2.getAdress());

        aln2.setNotaCie(9);
        System.out.println("Nota Ciências: " + aln2.getCie());

        aln2.setNotaMat(8);
        System.out.println("Nota Matemática: " + aln2.getMat());

        aln2.setNotaPt(7);
        System.out.println("Nota Português: " + aln2.getPt());

        System.out.println("Sua média é de: " + aln2.getMedia());

    
       // public void setNotaCie(double NotaCie){
           // this.NotaCie = NotaCie;
       // }
    }
}