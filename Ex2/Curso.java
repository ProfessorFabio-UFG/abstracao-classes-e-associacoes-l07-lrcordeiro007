

public class Curso {

    private String titulo;
    private String sigla;
    private Departamento departamento;

    public Curso(String titulo, String sigla, Departamento departamento){
        this.titulo = titulo;
        this.sigla = sigla;
        this.departamento = departamento;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setNome(String nome){
        this.titulo = titulo;
    }
    public String getSigla(){
        return sigla;
    }
    public void setSigla(String sigla){
        this.sigla = sigla;
    }
    public Departamento getDepto(){
        return departamento;
    }
    public void setDepto(Departamento departamento){
        this.departamento = departamento;
    }

    public String toString(){
        String printout = titulo +", "+sigla +",";
        printout = printout + departamento.toString();

        return printout;
    }
}
