/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes.bestia.trasgo;

import personajes.bestia.Bestia;

/**
 *
 * @author Diego Maldonado
 */
public class Trasgo extends Bestia{
    /**
     * Clase trasgo que extiende a bestia
     */
    private int ataque;

    /**
     * Constructor de la clase trasgo
     * @param ataque, almacena el ataque
     * @param id, almacena su id
     * @param nombre, almacena su nombre
     * @param vida, almacena su vida
     * @param armadura, almacena su armadura
     */
    public Trasgo(int ataque, int id, String nombre, int vida, int armadura) {
        super(id, nombre, vida, armadura);
        this.ataque = ataque;
    }

   /**
    * Metoado getter para obtener el ataque
    * @return 
    */
    @Override
    public int getAtaque() {
        return ataque;
    }

    /**
     * Metodo setter para setear el ataque
     * @param ataque 
     */
    @Override
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    /**
     * Metodo para mostrar al personaje
     */
    @Override
    public void mostrarPersonaje(){
        System.out.println("Trasgo [Id: "+getId()+" Nombre: "+getNombre()+ " Armadura: "+
                getArmadura()+" Ataque: "+this.ataque);
    }
    
}
