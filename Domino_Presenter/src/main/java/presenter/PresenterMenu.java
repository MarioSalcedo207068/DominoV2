package presenter;
import Interface.IMenu;
import domino.Jugador;
import frames.FrmConfig;
import frames.FrmInicio;
/**
 *
 * @author Equipo 02
 */

/**
 * @author Equipo 02
 */
public class PresenterMenu implements IMenu {

    FrmInicio frm1=new FrmInicio(this);
    //FrmConfig frm2=new FrmConfig();
    Jugador jugador;
    public PresenterPartida presenterPartida=new PresenterPartida();

    public PresenterMenu() {
        frm1.setVisible(true);
    }

    public PresenterMenu(FrmInicio frm1, FrmConfig frm2) {
        this.frm1 = frm1;
        //this.frm2 = frm2;
    }

    public PresenterMenu(FrmInicio frm1, FrmConfig frm2, Jugador jugador) {
        this.frm1 = frm1;
       // this.frm2 = frm2;
        this.jugador = jugador;
    }

    public FrmInicio getFrm1() {
        return frm1;
    }

    public void setFrm1(FrmInicio frm1) {
        this.frm1 = frm1;
    }


    public Jugador getJugador() {
        return jugador;
    }

    @Override
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
        presenterPartida.agregarJugadores(jugador);
        presenterPartida.iniciarJuego();
    }

    @Override
    public void returnToMenu() {
        
    }

    @Override
    public void addPlayer(String playerName, String playerAvatar) {
        
    }

    @Override
    public void createNewGame(int numPlayers, int numTokensPerPlayers) {
        
    }

    @Override
    public void verifyGameData(int numOfTokens, int numOfPlayers) {
        
    }
    
    
    

}
