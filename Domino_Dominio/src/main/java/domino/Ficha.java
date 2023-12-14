/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;

/**
 *
 * @author HP
 */
public class Ficha {

    private int a;
    private int b;

    public Ficha() {
    }

    public Ficha(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public boolean validarMula() {
        if (a == b) {
            return true;
        }
        return false;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getScore() {
        return a + b;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.a;
        hash = 71 * hash + this.b;
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
        final Ficha other = (Ficha) obj;
        if (this.a != other.a) {
            return false;
        }
        if (this.b != other.b) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Domino{" + "a=" + a + ", b=" + b + '}';
    }

}
