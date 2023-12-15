/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.Control;
import data.PlayerToken;
import domino.Ficha;
import domino.Jugador;
import interfaces.IModelo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class ModeloPartida implements IModelo {

    Control control;

    public ModeloPartida() {
        this.control = new Control();
    }

    @Override
    public void repartirFichas() {
        control.enviarEvento(Estados.ASIGNAR_FICHAS_JUGADORES, null, null);
    }

    @Override
    public void addPlayer(Jugador jugador) {
        control.enviarEvento(Estados.AGREGAR_JUGADORES, jugador, null);
    }

    @Override
    public void moverFicha(Ficha fichaJugador, Ficha fichaTablero) {
        control.enviarEvento(Estados.MOVER_FICHA, fichaJugador, fichaTablero);
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public List<Ficha> listaFichasTablero() {
        return control.getGame().getBoard().getBoardToken().getFichasBoard();
    }

}
