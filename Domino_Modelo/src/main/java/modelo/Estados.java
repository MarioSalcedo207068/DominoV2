/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author HP
 */
public enum Estados {
    EN_ESPERA,
    ASIGNAR_FICHAS_JUGADORES, //AsignarFichasAJugador 
    AGREGAR_JUGADORES,
    MOVER_FICHA,
    FICHA_VALIDA, //ValidarFichaTablero1
    FICHA_INVALIDA, //ValidarFichaTablero2
    PUNTUACIONES_CALCULADO, //CalcularScoreJugadores
    JUEGO_ACTIVO, //Estado Neutral del juego
    FICHAS_DEVUELTAS_POZO, //DevolverFichasAlPozo
    FICHAS_INSERTADAS_TABLERO, //InsertarFichaJugadorAlTablero
    JUGADOR_SIN_FICHAS,//VerificarCantidadFichasJugador1
    JUGADOR_CON_FICHAS,//VerificarCantidadFichasJugador2
    JUGADOR_FICHA_POZO,//ObtenerFichaDelPozo
}
