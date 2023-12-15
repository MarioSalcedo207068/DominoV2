package expertos;

import blackBoard.Game;
import data.PlayerToken;
import data.Pond;
import java.util.List;
import java.util.Random;
import modelo.ModeloPartida;

/**
 *
 * @author Equipo 02
 */
public class AsignarFichasAJugadores implements IExpertos<Game, Object> {

    public AsignarFichasAJugadores() {
    }

    public void repartirFichasJugador(Game game) {
        Random rand = new Random();
        List<PlayerToken> playerTokens = game.getPlayerTokens();
        int numFichas = game.getNumFichas();
        Pond pond = game.getBoard().getPond();
        for (int i = 0; i < playerTokens.size(); i++) {
            for (int j = 0; j < numFichas; j++) {
                int indiceAleatorio = rand.nextInt(pond.getFichas().size());
                playerTokens.get(i).pushToken(pond.getFicha(indiceAleatorio));
            }
        }
    }

    @Override
    public void resolver(Game game, Object object) {
        this.repartirFichasJugador(game);
        game.actualizarTodos();
    }

}
