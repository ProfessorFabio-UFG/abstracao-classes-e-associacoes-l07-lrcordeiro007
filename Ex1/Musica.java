
public class Musica {
    private String titulo;
    private int ano;
    private String tipo;
    private Compositor compositor[];

    public Musica(String titulo, int ano, String tipo, Compositor[] compositor) {
        this.titulo = titulo;
        this.ano = ano;
        this.tipo = tipo;
        this.compositor = compositor;
    }
    public String getTitulo(){return titulo;}
    public void setTitulo(String titulo){this.titulo = titulo;}


    public int getAno(){return ano;}
    public void setAno(int ano){this.ano = ano;}


    public String getTipo(){return tipo;}
    public void setTipo(String tipo){this.tipo = tipo;}


    public Compositor[] getCompositor(){return compositor;}
    public void setCompositor(Compositor compositor[]){
        this.compositor = compositor;
    }

    public String toString(){
        String printout = "Nome da Musica: "+ titulo +"\n"+
        "Ano de criaçao: "+ ano+"\n"+
        "Estilo musical: "+ tipo +"\n";
        for(Compositor compositor : compositor){
            if (compositor != null){
                printout += compositor.toString();
            }
        }

        return printout;
    }
}
