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

    private Integer id;
    private int a;
    private int b;
    private boolean caraA = false;
    private boolean caraB = false;
    private Integer Ad_a;
    private Integer Ad_b;

    public Ficha() {
    }

    public Ficha(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Ficha(Integer id, int a, int b) {
        this.id = id;
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

    public boolean isCaraA() {
        return caraA;
    }

    public void setCaraA(boolean caraA) {
        this.caraA = caraA;
    }

    public boolean isCaraB() {
        return caraB;
    }

    public void setCaraB(boolean caraB) {
        this.caraB = caraB;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAd_a() {
        return Ad_a;
    }

    public void setAd_a(Integer Ad_a) {
        this.Ad_a = Ad_a;
    }

    public Integer getAd_b() {
        return Ad_b;
    }

    public void setAd_b(Integer Ad_b) {
        this.Ad_b = Ad_b;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.a;
        hash = 67 * hash + this.b;
        hash = 67 * hash + (this.caraA ? 1 : 0);
        hash = 67 * hash + (this.caraB ? 1 : 0);
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
        if (this.caraA != other.caraA) {
            return false;
        }
        if (this.caraB != other.caraB) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ficha{" + "id=" + id + ", a=" + a + ", b=" + b + ", caraA=" + caraA + ", caraB=" + caraB + '}';
    }

}
