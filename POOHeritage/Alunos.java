package POOHeritage;

public class Alunos extends Pessoas{
    //sub-classe; atributos especificos
    private int nMatri;
    private String curso;
    private String turma;
    private double mediaSem;
    
    public int getnMatri() {
        return nMatri;
    }
    public void setnMatri(int nMatri) {
        this.nMatri = nMatri;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
    public double getMediaSem() {
        return mediaSem;
    }
    public void setMediaSem(double mediaSem) {
        this.mediaSem = mediaSem;
    }

    







    
}
