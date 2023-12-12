/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draw;

import domino.Ficha;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author HP
 */
public class FichaDraw {

    protected int largo;
    protected int alto;
    protected int dimensionCuadrado;
    protected PuntoDraw puntoDraw;

    public FichaDraw(int largo, int alto) {
        this.largo = largo;
        this.alto = alto;
        int area = largo * alto;
        this.dimensionCuadrado = area / 9900;
        this.puntoDraw = new PuntoDraw();
    }

    public void dibujarFichaHorizontal(int x, int y, Ficha ficha, Graphics g) {;
        g.setColor(Color.yellow);
        g.drawRoundRect(x, y, dimensionCuadrado, dimensionCuadrado, 6, 6);
        puntoDraw.setHorizontal(true);
        puntoDraw.validarPunto(ficha.getA(), x, y, dimensionCuadrado, g);
        x = x + dimensionCuadrado;
        puntoDraw.validarPunto(ficha.getB(), x, y, dimensionCuadrado, g);
        g.drawRoundRect(x, y, dimensionCuadrado, dimensionCuadrado, 6, 6);

    }

    public void dibujarFichaVertical(int x, int y, Ficha ficha, Graphics g) {
        g.setColor(Color.yellow);
        g.drawRoundRect(x, y, dimensionCuadrado, dimensionCuadrado, 6, 6);
        puntoDraw.setHorizontal(false);
        puntoDraw.validarPunto(ficha.getA(), x, y, dimensionCuadrado, g);
        y = y + dimensionCuadrado;
        puntoDraw.validarPunto(ficha.getB(), x, y, dimensionCuadrado, g);
        g.drawRoundRect(x, y, dimensionCuadrado, dimensionCuadrado, 6, 6);

    }

}
