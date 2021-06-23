/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes.heroe;

import personajes.Personaje;

/**
 *
 * @author Diego Maldonado
 */
public class Heroe extends Personaje {
    /**
     * Clase heroe que extiende a personaje
     */
    private int id;

    /**
     * Constructor de la clase
     * @param id, almacena el id del heroe
     * @param nombre, almacena el nombre
     * @param vida, almacena la vida
     * @param armadura, almacena la armadura
     */
    public Heroe(int id, String nombre, int vida, int armadura) {
        super(nombre, vida, armadura);
        this.id = id;
    }

    /**
     * Obtenemos el id del heroe
     * @return 
     */
    public int getId() {
        return id;
    }
    
    /**
     * Metodo para mostrar al personaje
     */
    @Override
    public void mostrarPersonaje(){
        System.out.println("Heroe [Id"+this.id+" Nombre: "+getNombre()+"]");
    }
    
}
