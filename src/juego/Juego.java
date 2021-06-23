/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import personajes.VectorPersonajes;

/**
 *
 * @author Diego Maldonado
 */
public class Juego {
    /**
     * Clase juego que se encarga de controlar toda la logica del juego
     */
    
    public Juego(){
    }
    
    /**
     * Metodo para iniciar el juego
     */
   public void iniciarJuego(){
       VectorPersonajes personajes = new VectorPersonajes();
       personajes.inicializarBestias();
       personajes.inicializarHeroes();
       personajes.mostrarPersonajes();
   }
}
