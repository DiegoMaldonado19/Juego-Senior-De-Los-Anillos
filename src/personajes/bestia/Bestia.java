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
    
   private int id;

    public Bestia(int id, String nombre, int armadura, int ataque) {
        super(nombre, armadura, ataque);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
   public String mostrarBestia(){
       return "Bestia [Id:"+this.id+" Nombre: "+getNombre()+"]";
   }
   
   
}
