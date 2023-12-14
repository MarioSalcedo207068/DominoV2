/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domino.Ficha;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<Ficha> fichas = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i <= j) {
                    fichas.add(new Ficha(i, j));
                }
            }
        }
        System.out.println(fichas.size());
    }

}
