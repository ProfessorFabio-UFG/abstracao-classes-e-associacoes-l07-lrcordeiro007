
public class Departamento {
    private String sala;
    private String sigladep;

    public Departamento(String sala, String sigladep){
        this.sala = sala;
        this.sigladep = sigladep;
    }

    public String getSala(){
        return sala;
    }
    public void setSala(String sala){
        this.sala = sala;
    }
    public String getSigladep(){
        return sigladep;
    }
    public void setSigla(String sigladep){
        this.sigladep = sigladep;
    }

    public String toString(){
        return sala+","+sigladep+".";
    }
}
