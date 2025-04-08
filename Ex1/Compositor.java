
public class Compositor {
    private String nome;
    private String nacionalidade;


    public Compositor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
    public String getNome(){
      return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNacio(){
        return nacionalidade;
    }
    public void setNacio(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public String toString(){
        return "Nome do artista: "+ nome + "\n"+
        "Nacionalidade do artista: "+ nacionalidade +"\n";
    }

}
