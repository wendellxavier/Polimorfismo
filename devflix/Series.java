package devflix;

public class Series extends Filme{
    private int temporadas;
    private int episodioPorTemporada;
    private int episodioAtual;
    private int temporadaAtual;

    
    public void play(int temporada, int episodio) {
        if (validarEpisodio(temporada, episodio)){
            this.temporadaAtual = temporada;
            this.episodioAtual = episodio;
            System.out.println("Play: " + toString());
        } else{
            System.out.println("Episodio inválido");
        }
    }

    private boolean validarEpisodio(int temporada, int episodio){
        if(temporada == 0 || episodio == 0)
        return false;

        if(temporada > temporadas || episodio > episodioPorTemporada){
            return false;
        }

        return true;
    }

    public Series(String nome, int temporadas, int episodioPorTemporada) {
        super(nome);
        this.temporadas = temporadas;
        this.episodioPorTemporada = episodioPorTemporada;
        this.temporadaAtual = 1;
        this.episodioAtual = 1;
    
    }

    @Override
    public String toString() {
        
        String informacao = String.format("Serie %s %dx%02d (audio %s, legenda %s)",
         getNome(),
         temporadaAtual,
         episodioAtual, 
         getAudio(), 
         getLegenda());

        return informacao;
    }
    

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEspisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEspisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getEspisodioAtual() {
        return episodioAtual;
    }

    public void setEspisodioAtual(int episodioAtual) {
        this.episodioAtual = episodioAtual;
    }

    public int getTemporadaAtual() {
        return temporadaAtual;
    }

    public void setTemporadaAtual(int temporadaAtual) {
        this.temporadaAtual = temporadaAtual;
    }

    

    
    
}
