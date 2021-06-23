/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes.heroe.humano;

import personajes.heroe.Heroe;

/**
 *
 * @author Diego Maldonado
 */
public class Humano extends Heroe {
    /**
     * Clase humano que hereda de heroe
     */
    
    private int ataque;

    /**
     * Constructor de la clase humano
     * @param ataque , guarda el ataque del humano
     * @param id , guarda su id
     * @param nombre , guarda su nombre
     * @param vida , guarda su vida
     * @param armadura , guarda su armadura
     */
    public Humano(int ataque, int id, String nombre, int vida, int armadura) {
        super(id, nombre, vida, armadura);
        this.ataque = ataque;
    }

    /**
    * Metoado getter para obtener el ataque
    * @return 
    */
    public int getAtaque() {
        return ataque;
    }

    /**
     * Metodo setter para setear el ataque
     * @param ataque 
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    /**
     * Metodo para mostrar al personaje
     */
    @Override
    public void mostrarPersonaje(){
        System.out.println("Humano [Id: "+getId()+" Nombre: "+getNombre()+ " Armadura: "+
                getArmadura()+" Ataque: "+this.ataque);
    }
    
}
