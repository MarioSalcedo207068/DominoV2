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
public class Jugador {

    private Integer id;
    private String nombre;
    private String avatar;
    private boolean playerState;

    public Jugador() {
    }

    public Jugador(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Jugador(Integer id, String nombre, String avatar, boolean playerState) {
        this.id = id;
        this.nombre = nombre;
        this.avatar = avatar;
        this.playerState = playerState;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public boolean isPlayerState() {
        return playerState;
    }

    public void setPlayerState(boolean playerState) {
        this.playerState = playerState;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", avatar=" + avatar + ", playerState=" + playerState + '}';
    }

}
