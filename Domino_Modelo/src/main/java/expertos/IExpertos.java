/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expertos;

import blackBoard.Game;
import modelo.ModeloPartida;

/**
 *
 * @author HP
 */
public interface IExpertos<T, U> {

    public void resolver(T t, U u);
}
