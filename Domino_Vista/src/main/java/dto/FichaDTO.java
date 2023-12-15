/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import domino.Ficha;
import java.util.Objects;

/**
 *
 * @author HP
 */
public class FichaDTO {

    private Ficha ficha;
    //Cordenadas 
    private int x;
    private int y;
    Orientacion orientacion;

    public FichaDTO() {
        ficha = null;
    }

    public FichaDTO(Ficha ficha, int x, int y, Orientacion orientacion) {
        this.ficha = ficha;
        this.x = x;
        this.y = y;
        this.orientacion = orientacion;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(Orientacion orientacion) {
        this.orientacion = orientacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.ficha);
        hash = 23 * hash + this.x;
        hash = 23 * hash + this.y;
        hash = 23 * hash + Objects.hashCode(this.orientacion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FichaDTO other = (FichaDTO) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        if (!Objects.equals(this.ficha, other.ficha)) {
            return false;
        }
        if (this.orientacion != other.orientacion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FichaDTO{" + "ficha=" + ficha + ", x=" + x + ", y=" + y + ", orientacion=" + orientacion + '}';
    }

}
