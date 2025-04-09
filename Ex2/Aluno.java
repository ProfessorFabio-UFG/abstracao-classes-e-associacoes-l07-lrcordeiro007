
public class Aluno {
    private String nome;
    private int mat;
    private int ano;
    private Curso curso;


    public Aluno(String nome, int mat, int ano, Curso curso){
        this.nome = nome;
        this.mat= mat;
        this.ano = ano;
        this.curso = curso;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getMat(){
        return mat;
    }
    public void setMat(int mat){
        this.mat = mat;
    }
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public Curso getCurso(){
        return curso;
    }
    public void setCurso(){
        this.curso = curso;
    }

    public String toString(){
        String printout = nome +","+mat+","+ano+",";
        printout = printout + curso.toString();
        return printout;
    }
}
