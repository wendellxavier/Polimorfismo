import devflix.Filme;
import devflix.Series;
import devflix.Video;


public class App{
    public static void main(String[] args) throws Exception{
        Filme filme = new Filme("Condigo de conduta");
        filme.play();
        filme.play("ingles");
        filme.play("italiano", "espanhol");

        Series series = new Series("game of thrones", 10, 10);
        series.play(1, 6);
        System.out.println(series);

        
    }
}