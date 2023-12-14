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
public interface IModelo {

//    public Jugador obtainPlayer(int id);

    public void repartirFichas();

    public void addPlayers(List<Jugador> jugadores);

//    public int obtainPondNumberOfTokens();
//
//    public Estados obtainGameState();
//
//    public List<Ficha> obtainBoardTokenList();
//
//    public List<PlayerToken> obtainPlayerTokenList(int id);
//
//    public int obtainPlayerNumberOfTokens(int id);

}
