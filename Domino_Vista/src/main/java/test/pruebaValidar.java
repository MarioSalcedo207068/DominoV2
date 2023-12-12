/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import domino.Ficha;

/**
 *
 * @author PC
 */
public class pruebaValidar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Ficha ficha = new Ficha(2,5);
        validar(ficha,false);
        
    }
    
    public static void validar(Ficha ficha, boolean posicion)
    {
        Ficha fichaInicio = new Ficha(1,2);
        Ficha fichaFin = new Ficha(2,5);
        
        
        
        
        if(posicion == true)//Se compara con la parte izquierda del tablero 
        {
            if(ficha.getA() == fichaInicio.getA() || ficha.getB() == fichaInicio.getA() )
            {
                System.out.println("Ficha válida");
            }
            else
            {
                System.out.println("Ficha inválida");
            }
        }
        else
        {
            if(ficha.getA() == fichaFin.getB() || ficha.getB() == fichaFin.getB() )
            {
                System.out.println("Ficha válida");
            }
            else
            {
                System.out.println("Ficha inválida");
            }            
        }
    }
    
}
