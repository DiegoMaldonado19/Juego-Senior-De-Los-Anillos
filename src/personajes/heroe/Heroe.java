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
    
    private int id;

    public Heroe(int id, String nombre, int armadura, int ataque) {
        super(nombre, armadura, ataque);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String mostrarHeroe(){
        return "Heroe [Id"+this.id+" Nombre: "+getNombre()+"]";
    }
    
}
