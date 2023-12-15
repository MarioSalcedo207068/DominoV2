/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import domino.Jugador;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author HP
 */
public class Board {

    private Pond pond;
    private BoardToken boardToken;

    public Board() {
        this.pond = new Pond();
        this.boardToken = new BoardToken();

    }

    public Pond getPond() {
        return pond;
    }

    public BoardToken getBoardToken() {
        return boardToken;
    }

}
