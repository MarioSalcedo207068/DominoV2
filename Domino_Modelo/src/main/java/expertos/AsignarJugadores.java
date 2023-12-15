/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expertos;

import blackBoard.Game;
import domino.Jugador;
import java.util.ArrayList;
import java.util.List;
import modelo.ModeloPartida;

/**
 *
 * @author HP
 */
public class AsignarJugadores implements IExpertos<Game, Jugador> {

    public AsignarJugadores() {
    }

    public void agregarJugador(Game game, Jugador jugador) {
        game.addJugador(jugador);
    }

    public void resolver(Game game, Jugador jugador) {
        agregarJugador(game, jugador);
    }

}
