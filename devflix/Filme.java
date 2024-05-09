package devflix;

public class Filme extends Video{
    private String audio;
    private String legenda;


    public Filme(String nome){
        super(nome);
        this.audio = "Portugues";
        this.legenda  = "nenhuma";

    }
    
    @Override
    public void play() {
        System.out.println("Play: filme " + getNome());
    }

    public void play(String audio){
        this.audio = audio;
        if (audio == "portugues"){
            this.legenda = "nenhuma";
        } else {
            this.legenda = "portugues";
        }
        System.out.println("Play:" + toString());
    }

    public void play(String audio, String legenda){
        this.audio = audio;
        this.legenda = legenda;
        System.out.println("Play:" + toString());

    }

    public void play(String legenda, String qualidade, int resolucao){
        this.legenda = legenda;
    
        System.out.println("Play:" +  toString());

    }

    @Override
    public String toString() {
        String informacao = String.format("Filme %s (audio %s, legenda %s)", getNome(), audio, legenda);
        return informacao;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }

    
}
