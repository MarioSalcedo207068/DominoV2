/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expertos;

import blackBoard.Game;
import data.Board;
import data.BoardToken;
import data.PlayerToken;
import domino.Ficha;

/**
 *
 * @author HP
 */
public class MoverFicha implements IExpertos<Ficha, Ficha> {

    Game game = Game.obtenerInstancia();

    //Primera ficha es del jugador
    //Segunda ficha es del tablero
    public void moverFicha(Ficha fichaJugador, Ficha fichaTablero) {
        PlayerToken playerToken = game.buscarJugadorFicha(fichaJugador);
        BoardToken boardToken = game.getBoard().getBoardToken();
        if (fichaTablero != null) {
            if (fichaJugador.getA() == fichaTablero.getA() && fichaTablero.isCaraA() == false) {
                playerToken.pullToken(fichaJugador);
                fichaJugador.setCaraA(true);
                boardToken.removeFichaBoardToken(fichaTablero);
                fichaTablero.setCaraA(true);
                boardToken.addFichaBoardToken(fichaJugador);
                boardToken.addFichaBoardToken(fichaTablero);
            } else if (fichaJugador.getA() == fichaTablero.getB() && fichaTablero.isCaraB() == false) {
                playerToken.pullToken(fichaJugador);
                fichaJugador.setCaraA(true);
                boardToken.removeFichaBoardToken(fichaTablero);
                fichaTablero.setCaraB(true);
                boardToken.addFichaBoardToken(fichaJugador);
                boardToken.addFichaBoardToken(fichaTablero);
            } else if (fichaJugador.getB() == fichaTablero.getA() && fichaTablero.isCaraA() == false) {
                playerToken.pullToken(fichaJugador);
                fichaJugador.setCaraB(true);
                boardToken.removeFichaBoardToken(fichaTablero);
                fichaTablero.setCaraA(true);
                boardToken.addFichaBoardToken(fichaJugador);
                boardToken.addFichaBoardToken(fichaTablero);
            } else if (fichaJugador.getB() == fichaTablero.getB() && fichaTablero.isCaraB() == false) {
                playerToken.pullToken(fichaJugador);
                fichaJugador.setCaraB(true);
                boardToken.removeFichaBoardToken(fichaTablero);
                fichaTablero.setCaraB(true);
                boardToken.addFichaBoardToken(fichaJugador);
                boardToken.addFichaBoardToken(fichaTablero);
            }
        } else if (fichaTablero == null) {
            playerToken.pullToken(fichaJugador);
            boardToken.addFichaBoardToken(fichaJugador);
        }
    }

    @Override
    public void resolver(Ficha fichaJugador, Ficha fichaTablero) {
        moverFicha(fichaJugador, fichaTablero);
    }
}
