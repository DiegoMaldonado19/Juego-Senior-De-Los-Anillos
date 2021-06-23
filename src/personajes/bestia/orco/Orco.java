/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes.bestia.orco;

import personajes.bestia.Bestia;

/**
 *
 * @author Diego Maldonado
 */
public class Orco extends Bestia{
    /**
     * Clase orco que extiende a bestia
     */
    private int ataque;

    /**
     * Constructor de la clase
     * @param ataque, almacena el ataque
     * @param id, almacena el id
     * @param nombre, almacena el nombre
     * @param vida, almacena la vida
     * @param armadura, almacena la armadura
     */
    public Orco(int ataque, int id, String nombre, int vida, int armadura) {
        super(id, nombre, vida, armadura);
        this.ataque = ataque;
    }

    /**
     * Obtenemos el ataque
     * @return 
     */
    public int getAtaque() {
        return ataque;
    }
    
    /**
     * Seteamos el ataque
     * @param ataque 
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
   
    /**
     * Metodo para mostrara al personaje
     */
    @Override
    public void mostrarPersonaje(){
        System.out.println("Orco [Id: "+getId()+" Nombre: "+getNombre()+ " Armadura: "+
                getArmadura()+" Ataque: "+this.ataque);
    }
    
    
}
