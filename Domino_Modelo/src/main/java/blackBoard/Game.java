/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBoard;

import data.Board;
import data.PlayerToken;
import domino.Ficha;
import domino.Jugador;
import java.util.ArrayList;
import java.util.List;
import modelo.Estados;
import observador.IObservable;
import observador.IObservador;

/**
 *
 * @author HP
 */
public class Game implements IObservable {

    private List<IObservador> observadores;
    private List<PlayerToken> playerTokens;
    private Board board;
    private int numFichas;
    private static Game game;

    public static synchronized Game obtenerInstancia() {
        if (game == null) {
            game = new Game(7);
        }
        return game;
    }

    private Game(int numFichas) {
        this.numFichas = numFichas;
        this.board = new Board();
        this.observadores = new ArrayList<>();
        this.playerTokens = new ArrayList<>();

    }

    /**
     * Finalizar el turno según el estado del Jugador
     */
    public void endTurn() {
    }

    public void imprimirJugadores() {
        for (PlayerToken playerToken : playerTokens) {
            System.out.println(playerToken.toString());
        }
    }

    public Jugador obtenerInformacionJugador(Integer id) {
        for (PlayerToken playerToken : playerTokens) {
            if (playerToken.getJugador().getId().equals(id)) {
                return playerToken.getJugador();
            }
        }
        return null;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public int getNumFichas() {
        return numFichas;
    }

    public List<PlayerToken> getPlayerTokens() {
        return playerTokens;
    }

    public void addJugador(Jugador jugador) {
        playerTokens.add(new PlayerToken(jugador));
    }

    public PlayerToken buscarJugadorFicha(Ficha ficha) {
        for (PlayerToken playerToken : playerTokens) {
            for (Ficha fichas : playerToken.getFichasJugador()) {
                if (fichas.equals(ficha)) {
                    return playerToken;
                }
            }
        }
        return null;
    }

    @Override
    public void actualizarTodos() {
        for (IObservador observador : observadores) {
            observador.actualizar(this);
        }
    }

    @Override
    public void agregarObservador(IObservador observador) {
        this.observadores.add(observador);
    }

    @Override
    public void eliminarObservador(IObservador observador) {
        this.observadores.remove(observador);
    }

}
