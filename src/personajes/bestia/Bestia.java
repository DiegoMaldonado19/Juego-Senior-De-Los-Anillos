/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes.bestia;

import personajes.Personaje;

/**
 *
 * @author Diego Maldonado
 */
public class Bestia extends Personaje{
    /**
     * Clase bestia que extiende a personaje
     */
   private int id;

   /**
    * Constructor de la clase
    * @param id, almacena el id
    * @param nombre, almacena el nombre
    * @param vida, almacena la vida
    * @param armadura, almacena la armadura
    */
    public Bestia(int id, String nombre, int vida, int armadura) {
        super(nombre, vida, armadura);
        this.id = id;
    }

    /**
     * Metodo para obtener su id
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
    * Metoado getter para obtener el ataque
    * @return 
    */
    public int getAtaque() {
        return getAtaque();
    }

    /**
     * Metodo setter para setear el ataque
     * @param ataque 
     */
    public void setAtaque(int ataque) {
        setAtaque(ataque);
    }
    
    /**
     * Metodo para mostrar a personaje
     */
    @Override
    public void mostrarPersonaje(){
       System.out.println("Bestia [Id:"+this.id+" Nombre: "+getNombre()+"]");
    }
   
   
}
