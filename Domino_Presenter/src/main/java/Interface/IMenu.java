package Interface;

import domino.Jugador;

/**
 *
 * @author Equipo 02
 */
public interface IMenu 
{
    
    public void returnToMenu();
    public void addPlayer(String playerName,String playerAvatar);
    public void createNewGame(int numPlayers, int numTokensPerPlayers); 
    public void verifyGameData(int numOfTokens, int numOfPlayers);
    public void setJugador(Jugador jugador);
}
