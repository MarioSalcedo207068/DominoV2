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
    List<Jugador> jugadores = new ArrayList<>();

    public ModeloPartida() {
        this.control = new Control(this);
    }

    @Override
    public void repartirFichas() {
        control.enviarEvento(Estados.ASIGNAR_FICHAS_JUGADORES);
    }

    @Override
    public void addPlayers(List<Jugador> jugadores) {
        this.jugadores = jugadores;
        control.enviarEvento(Estados.AGREGAR_JUGADORES);
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

}
