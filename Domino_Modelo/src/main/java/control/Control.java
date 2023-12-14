/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import blackBoard.Game;
import domino.Jugador;
import expertos.AsignarFichasAJugadores;
import expertos.AsignarJugadores;
import expertos.IExpertos;
import java.util.ArrayList;
import java.util.List;
import modelo.Estados;
import modelo.ModeloPartida;
import observador.IObservador;

/**
 *
 * @author HP
 */
public class Control implements IObservador {

    private List<IExpertos> expertos;

    private Game game;
    private ModeloPartida modeloPartida;

    public Control(ModeloPartida modeloPartida) {
        this.modeloPartida = modeloPartida;

        //esto se elimina
        game = new Game(4);
        game.agregarObservador(this);
        this.expertos = new ArrayList<>();
        expertos.add(new AsignarFichasAJugadores());
        expertos.add(new AsignarJugadores());
    }

    @Override
    public void actualizar(Game game) {
        this.game = game;
    }

    public void enviarEvento(Estados tipoEstado) {
        validarExperto(tipoEstado);
    }

    public void validarExperto(Estados tipoEstado) {
        IExpertos ex;
        switch (tipoEstado) {
            case ASIGNAR_FICHAS_JUGADORES:
                ex = expertos.get(0);
                ex.resolver(game, modeloPartida);
                break;
            case AGREGAR_JUGADORES:
                ex = expertos.get(1);
                ex.resolver(game, modeloPartida);
                break;
        }
    }

    public Game getGame() {
        return game;
    }

}
