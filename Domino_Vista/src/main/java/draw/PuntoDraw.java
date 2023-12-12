/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draw;

import java.awt.Graphics;

/**
 *
 * @author HP
 */
public class PuntoDraw {

    private boolean horizontal;

    public void validarPunto(int punto, int x, int y, int dimensionCuadrado, Graphics g) {

        if (punto == 1) {
            this.dibujar1(x, y, dimensionCuadrado, g);
        } else if (punto == 2) {
            this.dibujar2(x, y, dimensionCuadrado, g);
        } else if (punto == 3) {
            this.dibujar3(x, y, dimensionCuadrado, g);
        } else if (punto == 4) {
            this.dibujar4(x, y, dimensionCuadrado, g);
        } else if (punto == 5) {
            this.dibujar5(x, y, dimensionCuadrado, g);
        } else if (punto == 6) {
            this.dibujar6(x, y, dimensionCuadrado, g);
        }

    }

    public void dibujar1(int x, int y, int dimensionCuadrado, Graphics g) {
        int escabilidad = dimensionCuadrado / 4;
        int grosorPunto = dimensionCuadrado / 6;
        int margenPunto = grosorPunto / 2;
        g.fillOval(x + (escabilidad * 2) - margenPunto,
                y + (escabilidad * 2) - margenPunto, grosorPunto, grosorPunto);
    }

    public void dibujar2(int x, int y, int dimensionCuadrado, Graphics g) {
        int escabilidad = dimensionCuadrado / 4;
        int grosorPunto = dimensionCuadrado / 6;
        int margenPunto = grosorPunto / 2;
        g.fillOval(x + (escabilidad * 3) - margenPunto,
                y + (escabilidad * 1) - margenPunto, grosorPunto, grosorPunto);
        g.fillOval(x + (escabilidad * 1) - margenPunto,
                y + (escabilidad * 3) - margenPunto, grosorPunto, grosorPunto);
    }

    public void dibujar3(int x, int y, int dimensionCuadrado, Graphics g) {
        int escabilidad = dimensionCuadrado / 4;
        int grosorPunto = dimensionCuadrado / 6;
        int margenPunto = grosorPunto / 2;
        g.fillOval(x + (escabilidad * 1) - margenPunto,
                y + (escabilidad * 1) - margenPunto, grosorPunto, grosorPunto);
        g.fillOval(x + (escabilidad * 2) - margenPunto,
                y + (escabilidad * 2) - margenPunto, grosorPunto, grosorPunto);
        g.fillOval(x + (escabilidad * 3) - margenPunto,
                y + (escabilidad * 3) - margenPunto, grosorPunto, grosorPunto);
    }

    public void dibujar4(int x, int y, int dimensionCuadrado, Graphics g) {
        int escabilidad = dimensionCuadrado / 4;
        int grosorPunto = dimensionCuadrado / 6;
        int margenPunto = grosorPunto / 2;
        g.fillOval(x + (escabilidad * 1) - margenPunto,
                y + (escabilidad * 1) - margenPunto, grosorPunto, grosorPunto);
        g.fillOval(x + (escabilidad * 3) - margenPunto, y + (escabilidad * 1)
                - margenPunto, grosorPunto, grosorPunto);
        g.fillOval(x + (escabilidad * 1) - margenPunto, y + (escabilidad * 3)
                - margenPunto, grosorPunto, grosorPunto);
        g.fillOval(x + (escabilidad * 3) - margenPunto, y + (escabilidad * 3)
                - margenPunto, grosorPunto, grosorPunto);
    }

    public void dibujar5(int x, int y, int dimensionCuadrado, Graphics g) {
        int escabilidad = dimensionCuadrado / 4;
        int grosorPunto = dimensionCuadrado / 6;
        int margenPunto = grosorPunto / 2;
        g.fillOval(x + (escabilidad * 1) - margenPunto,
                y + (escabilidad * 1) - margenPunto, grosorPunto, grosorPunto);
        g.fillOval(x + (escabilidad * 3) - margenPunto, y + (escabilidad * 1)
                - margenPunto, grosorPunto, grosorPunto);
        g.fillOval(x + (escabilidad * 2) - margenPunto,
                y + (escabilidad * 2) - margenPunto, grosorPunto, grosorPunto);
        g.fillOval(x + (escabilidad * 1) - margenPunto, y + (escabilidad * 3)
                - margenPunto, grosorPunto, grosorPunto);
        g.fillOval(x + (escabilidad * 3) - margenPunto, y + (escabilidad * 3)
                - margenPunto, grosorPunto, grosorPunto);
    }

    public void dibujar6(int x, int y, int dimensionCuadrado, Graphics g) {
        int escabilidad = dimensionCuadrado / 4;
        int grosorPunto = dimensionCuadrado / 6;
        int margenPunto = grosorPunto / 2;
        if (horizontal) {
            g.fillOval(x + (escabilidad * 1) - margenPunto,
                    y + (escabilidad * 1) - margenPunto, grosorPunto, grosorPunto);
            g.fillOval(x + (escabilidad * 2) - margenPunto,
                    y + (escabilidad * 1) - margenPunto, grosorPunto, grosorPunto);
            g.fillOval(x + (escabilidad * 3) - margenPunto,
                    y + (escabilidad * 1) - margenPunto, grosorPunto, grosorPunto);
            g.fillOval(x + (escabilidad * 1) - margenPunto,
                    y + (escabilidad * 3) - margenPunto, grosorPunto, grosorPunto);
            g.fillOval(x + (escabilidad * 2) - margenPunto,
                    y + (escabilidad * 3) - margenPunto, grosorPunto, grosorPunto);
            g.fillOval(x + (escabilidad * 3) - margenPunto,
                    y + (escabilidad * 3) - margenPunto, grosorPunto, grosorPunto);
        } else {
            g.fillOval(x + (escabilidad * 1) - margenPunto,
                    y + (escabilidad * 1) - margenPunto, grosorPunto, grosorPunto);
            g.fillOval(x + (escabilidad * 1) - margenPunto,
                    y + (escabilidad * 2) - margenPunto, grosorPunto, grosorPunto);
            g.fillOval(x + (escabilidad * 3) - margenPunto, y + (escabilidad * 1)
                    - margenPunto, grosorPunto, grosorPunto);
            g.fillOval(x + (escabilidad * 1) - margenPunto, y + (escabilidad * 3)
                    - margenPunto, grosorPunto, grosorPunto);
            g.fillOval(x + (escabilidad * 3) - margenPunto, y + (escabilidad * 2)
                    - margenPunto, grosorPunto, grosorPunto);
            g.fillOval(x + (escabilidad * 3) - margenPunto, y + (escabilidad * 3)
                    - margenPunto, grosorPunto, grosorPunto);
        }

    }

    public void setHorizontal(boolean horizontal) {
        this.horizontal = horizontal;
    }

}
