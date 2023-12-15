/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import domino.Ficha;
import java.util.Dictionary;
import java.util.List;
import modelo.Estados;
import data.PlayerToken;
import domino.Jugador;

/**
 *
 * @author HP
 */
public interface IModeloPartida {

//    public Jugador obtainPlayer(int id);
    public void repartirFichas();

    public void addPlayer(Jugador jugadores);

    public void moverFicha(Ficha fichaJugador, Ficha fichaTablero);


}
