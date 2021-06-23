/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes.heroe.hobbit;

import personajes.heroe.Heroe;

/**
 *
 * @author Diego Maldonado
 */
public class Hobbit extends Heroe{
    /**
     * Clase Hobbit que extiende a heroe
     */
   private int ataque;

    /**
     * Constructor de la clase hobbit
     * @param ataque , guarda el ataque
     * @param id , guarda el id
     * @param nombre , guarda el nombre
     * @param vida , guarda su vida
     * @param armadura , guarda su armadura
     */
    public Hobbit(int ataque, int id, String nombre, int vida, int armadura) {
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
        System.out.println("Hobbit [Id: "+getId()+" Nombre: "+getNombre()+ " Armadura: "+
                getArmadura()+" Ataque: "+this.ataque);
    }
}
