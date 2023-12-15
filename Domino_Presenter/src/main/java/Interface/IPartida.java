/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import domino.Ficha;
import domino.Jugador;
import java.util.List;

/**
 *
 * @author JDSan
 */
public interface IPartida 
{
    public void obtainTokenFromPond(Jugador player);
    public void updatePlayerTokenList(List<Ficha> tokenList);
    public void boardError();
    public void pondError();
    public void exitGame();
    public void moverFicha(Ficha fichaJugador, Ficha fichatablero);
}
