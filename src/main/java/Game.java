import java.util.ArrayList;
import java.util.Collection;

public class Game {

    protected Collection<Player> players = new ArrayList<>();

    public void register(Player player) {
        this.players.add(player);
    }

    public int round(String playerName1, String playerName2) {
        int competitor1 = 0;
        int competitor2 = 0;
        for (Player player : players) {
            if (player.getName().contains(playerName1)) {
                competitor1 = player.getStrength();
            }
            if (player.getName().contains(playerName2)) {
                competitor2 = player.getStrength();
            }
        }
        if (competitor1 == 0 || competitor2 == 0) {throw new NotRegisteredException(
                "Оба игрока должны быть зарегистрированы для участия в турнире");}
        if (competitor1 > competitor2) {
            return 1;
        } else {
            if (competitor2 > competitor1) {
                return 2;
            } else {return 0;}
        }
    }

}
