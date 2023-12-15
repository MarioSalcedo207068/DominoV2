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

    public void addFichaBoardToken(Ficha ficha) {
        fichasBoard.add(ficha);
    }

    public void removeFichaBoardToken(Ficha ficha) {
        fichasBoard.remove(ficha);
    }

    public List<Ficha> getFichasBoard() {
        return fichasBoard;
    }
    
    public Integer verificarFicha(Ficha ficha){
        for (int i = 0; i < fichasBoard.size(); i++) {
            if (ficha.getId().equals(fichasBoard.get(i).getId())){
                return i;
            }
        }
        return null;
    }
    
    public void actualizarFicha(Ficha ficha){
        Integer pos=verificarFicha(ficha);
        fichasBoard.set(pos, ficha);
    }

}
