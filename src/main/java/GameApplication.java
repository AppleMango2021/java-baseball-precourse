import domain.Game;
import domain.OffensePlayer;

public class GameApplication {

    public static void main(String[] args){

        Game game = new Game();
        while(game.getStatus() == Game.Status.ONGOING){
            game.play();
        }
    }
}
