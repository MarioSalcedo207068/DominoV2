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
public class AsignarJugadores implements IExpertos {

    public AsignarJugadores() {
    }

    public void agregarJugadores(Game game, ModeloPartida modeloPartida) {
        game.setJugadores(modeloPartida.getJugadores());
    }

    @Override
    public void resolver(Game game, ModeloPartida modeloPartida) {
        agregarJugadores(game, modeloPartida);
    }

}
