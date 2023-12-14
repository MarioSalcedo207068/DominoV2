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
public class Pond {

    List<Ficha> fichas;

    public Pond() {
        this.fichas = new ArrayList<>();
        calcularFichas();
    }

    public void calcularFichas() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i <= j) {
                    fichas.add(new Ficha(i, j));
                }
            }
        }
    }

    public void pullToken(Ficha ficha) {
        this.fichas.remove(ficha);
    }

    public void pushToken(Ficha ficha) {
        this.fichas.add(ficha);
    }

    public Ficha getFicha(int numFicha) {
        Ficha ficha = this.fichas.get(numFicha);
        this.pullToken(ficha);
        return ficha;
    }

    public void addTokensToPond(List<Ficha> fichas) {
        for (int i = 0; i < fichas.size(); i++) {
            this.pushToken(fichas.get(i));
        }
    }

    public int getNumOfTokens() {
        return fichas.size();
    }

    public List<Ficha> getFichas() {
        return fichas;
    }

    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }

}
