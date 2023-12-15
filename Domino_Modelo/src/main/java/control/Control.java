/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import blackBoard.Game;
import expertos.AsignarFichasAJugadores;
import expertos.AsignarJugadores;
import expertos.IExpertos;
import expertos.MoverFicha;
import java.util.ArrayList;
import java.util.List;
import modelo.Estados;
import observador.IObservador;

/**
 *
 * @author HP
 */
public class Control implements IObservador {

    private List<IExpertos> expertos;
    private Game game;

    public Control() {
        game = Game.obtenerInstancia();
        game.agregarObservador(this);
        this.expertos = new ArrayList<>();
        expertos.add(new AsignarFichasAJugadores());
        expertos.add(new AsignarJugadores());
        expertos.add(new MoverFicha());
    }

    @Override
    public void actualizar(Game game) {
        this.game = game;
    }

    public void enviarEvento(Estados tipoEstado, Object object, Object object1) {
        validarExperto(tipoEstado, object, object1);
    }

    public void validarExperto(Estados tipoEstado, Object object, Object object1) {
        IExpertos ex;
        switch (tipoEstado) {
            case ASIGNAR_FICHAS_JUGADORES:
                ex = expertos.get(0);
                ex.resolver(game, null);
                break;
            case AGREGAR_JUGADORES:
                ex = expertos.get(1);
                ex.resolver(game, object);
                break;
            case MOVER_FICHA:
                ex = expertos.get(2);
                ex.resolver(object, object1);
                break;
        }
    }

    public Game getGame() {
        return game;
    }

}
