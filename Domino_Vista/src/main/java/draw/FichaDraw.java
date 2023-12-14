/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draw;

import domino.Ficha;
import dto.FichaDTO;
import dto.Orientacion;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author HP
 */
public class FichaDraw {

    protected int dimensionCuadrado;
    protected PuntoDraw puntoDraw;

//    public FichaDraw(int largo, int alto) {
//        int area = largo * alto;
//        this.dimensionCuadrado = area / 9900;
//        this.puntoDraw = new PuntoDraw();
//    }
    public FichaDraw(int dimensionCuadrado) {
        this.dimensionCuadrado = dimensionCuadrado;
        this.puntoDraw = new PuntoDraw();
    }

    public void dibujarFicha(FichaDTO fichaDTO, Graphics g) {
        if (fichaDTO.getOrientacion().equals(Orientacion.HORIZONTAL)) {
            dibujarFichaHorizontal(fichaDTO, g);
        } else {
            dibujarFichaVertical(fichaDTO, g);
        }
    }

    public void dibujarFichaHorizontal(FichaDTO fichaDTO, Graphics g) {
        int x = fichaDTO.getX();
        int y = fichaDTO.getY();
        Ficha ficha = fichaDTO.getFicha();
        g.setColor(Color.yellow);
        g.drawRoundRect(x, y, dimensionCuadrado, dimensionCuadrado, 6, 6);
        puntoDraw.setHorizontal(true);
        puntoDraw.validarPunto(ficha.getA(), x, y, dimensionCuadrado, g);
        x = x + dimensionCuadrado;
        puntoDraw.validarPunto(ficha.getB(), x, y, dimensionCuadrado, g);
        g.drawRoundRect(x, y, dimensionCuadrado, dimensionCuadrado, 6, 6);

    }

    public void dibujarFichaVertical(FichaDTO fichaDTO, Graphics g) {
        int x = fichaDTO.getX();
        int y = fichaDTO.getY();
        Ficha ficha = fichaDTO.getFicha();
        g.setColor(Color.yellow);
        g.drawRoundRect(x, y, dimensionCuadrado, dimensionCuadrado, 6, 6);
        puntoDraw.setHorizontal(false);
        puntoDraw.validarPunto(ficha.getA(), x, y, dimensionCuadrado, g);
        y = y + dimensionCuadrado;
        puntoDraw.validarPunto(ficha.getB(), x, y, dimensionCuadrado, g);
        g.drawRoundRect(x, y, dimensionCuadrado, dimensionCuadrado, 6, 6);

    }

    public int getDimensionCuadrado() {
        return dimensionCuadrado;
    }

}
