/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import domino.Ficha;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class BoardToken {

    private List<Ficha> fichasBoard;

    public BoardToken() {
        this.fichasBoard = new ArrayList<>();
    }

    public int getNumOfTokens() {
        return fichasBoard.size();
    }

}
