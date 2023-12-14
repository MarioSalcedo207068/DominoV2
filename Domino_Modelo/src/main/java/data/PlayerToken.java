/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import domino.Ficha;
import domino.Jugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class PlayerToken {

    private List<Ficha> fichasJugador = new ArrayList<>();
    private Jugador jugador;

    public int totalScore() {
        int total = 0;
        for (Ficha ficha : fichasJugador) {
            total += ficha.getScore();
        }
        return total;
    }

    public PlayerToken() {
    }

    public PlayerToken(Jugador jugador) {
        this.jugador = jugador;
    }

    public List<Ficha> getFichasJugador() {
        return fichasJugador;
    }

    public void setFichasJugador(List<Ficha> fichasJugador) {
        this.fichasJugador = fichasJugador;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public int getNumOfTokens() {
        return fichasJugador.size();
    }

    public void pushToken(Ficha ficha) {
        this.fichasJugador.add(ficha);
    }

    public void pullToken(Ficha ficha) {
        this.fichasJugador.remove(ficha);
    }

    @Override
    public String toString() {
        return "PlayerToken{" + "fichasJugador=" + fichasJugador + ", jugador=" + jugador + '}';
    }

}
