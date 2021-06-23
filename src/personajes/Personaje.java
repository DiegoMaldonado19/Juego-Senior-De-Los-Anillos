/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes;

/**
 *
 * @author Diego Maldonado
 */
public class Personaje {
    /**
     * Clase personaje
     * Atributos de la clase personaje
     */
    private String nombre;
    private int vida;
    private int armadura;
    private boolean vivo;
    private int ataque;
    
    /**
     * Constructor por defecto de la clase personaje
     * @param nombre 
     */
    public Personaje(String nombre, int armadura, int ataque){
        this.nombre = nombre;
        this.vida = 100;
        this.armadura = armadura;
        this.ataque = ataque;
        this.vivo = true;
    }

    /**
     * Metodo para obtener el nombre del personaje
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para obtener la vida del personaje
     * @return 
     */
    public int getVida() {
        return vida;
    }

    /**
     * Metodo para settear la vida del personaje
     * @param vida 
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * Metodo para obtener la armadura del personaje
     * @return 
     */
    public int getArmadura() {
        return armadura;
    }

    /**
     * Metodo para settear la armadura del personaje
     * @param armadura 
     */
    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    /**
     * Metodo para saber si esta vivo el personaje
     * @return 
     */
    public boolean isVivo() {
        return vivo;
    }

    /**
     * Metodo para obtener el ataque de un personaje
     * @return 
     */
    public int getAtaque(){
        return ataque;
    }
    
    /**
     * Metodo para settear el ataque de un personaje
     * @param ataque 
     */
    public void setAtaque(int ataque){
        this.ataque = ataque;
    }
    
    /**
     * Metodo para saber si está muerto el personaje
     * @param vivo 
     */
    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }    
}
