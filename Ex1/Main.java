
public class Main {
    
    public static void main(String[] args) {
        
        Musica musica[] = new Musica[2];
        Compositor compositor[] = new Compositor[2];
        
        compositor[0] = new Compositor("Link Park", "EUA");
        compositor[1] = new Compositor("Michael Jackson", "EUA");

        Compositor comps[] = new Compositor[1];
        comps[0] = compositor[0]; 
        musica[0] = new Musica("Numb", 1990, "rock internacional", comps);


        Compositor comps2[] = new Compositor[1];
        comps2[0] = compositor[1];
        musica[1] = new Musica("Billie Jean", 1970, "Rock internacional", comps2);

        System.out.println(musica[0]);
        System.out.println(musica[1]);
    }
}
