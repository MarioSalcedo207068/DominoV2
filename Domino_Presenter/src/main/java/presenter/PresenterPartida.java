/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import domino.Ficha;
import domino.Jugador;
import frames.FrmPartida;
import java.util.ArrayList;
import java.util.List;
import modelo.ModeloPartida;

/**
 *
 * @author HP
 */
public class PresenterPartida {

    ModeloPartida modeloPartida=new ModeloPartida();
    FrmPartida frmPartida;

    public PresenterPartida() {

    }

    //Metodos de pruebas
    public void agregarJugadores(Jugador jugador) {
        //Jugador j1 = new Jugador(1, "Daniel");
        //Jugador j2 = new Jugador(2, "Mario");
        //List<Jugador> jugadores = new ArrayList<>();
        //jugadores.add(j1);
        //jugadores.add(j2);
        //modeloPartida.addPlayer(jugadores.get(0));
        
        modeloPartida.addPlayer(jugador);
        modeloPartida.repartirFichas();
        modeloPartida.getControl().getGame().imprimirJugadores();
    }

    public void moverFicha(Ficha fichaJugador, Ficha fichatablero) {
        modeloPartida.moverFicha(fichaJugador, fichatablero);
        frmPartida.repaint();
        modeloPartida.getControl().getGame().imprimirJugadores();
    }
    
    public void iniciarJuego(){
        modeloPartida = new ModeloPartida();
        frmPartida = new FrmPartida(modeloPartida.getControl().getGame().
                getPlayerTokens().get(0).getFichasJugador(), modeloPartida.getControl().getGame().
                getPlayerTokens().get(0).getJugador(), this, modeloPartida.listaFichasTablero());
        frmPartida.setVisible(true);
    }
}
