/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes;

import juego.Dado;
import personajes.bestia.Bestia;
import personajes.bestia.orco.Orco;
import personajes.bestia.trasgo.Trasgo;
import personajes.heroe.Heroe;
import personajes.heroe.elfo.Elfo;
import personajes.heroe.hobbit.Hobbit;
import personajes.heroe.humano.Humano;

/**
 *
 * @author Diego Maldonado
 */
public class VectorPersonajes {
    /**
     * Arreglos para heroes y bestias, y objeto de tipo dado
     */
    private Heroe[] heroes;
    private Bestia[] bestias;
    private Dado dado = new Dado();
    
    /**
     * Constructor de la clase
     */
    public VectorPersonajes(){
        heroes = new Heroe[10];
        bestias = new Bestia[10];
    }
    
    /**
     * Metodo para inicializar heroes
     */
    public void inicializarHeroes(){
        int ataque=0;
        int armadura=0;
        int id = 0;
        for(int i=0; i<heroes.length; i++){
            ataque = dado.tirarDado(100, 2);
            armadura = dado.tirarDado(60, 1);
            id = i+1;
            if(i>=0 && i<=3){
                heroes[i] = new Humano(ataque, id, "Humano", 180, armadura);
            }       
            else if(i>=5 && i<=6){
                heroes[i] = new Hobbit(ataque, id, "Hobbit", 200, armadura);
            }
            else{
                heroes[i] = new Elfo(ataque, id, "Elfo", 250, armadura);
            }
        }
    }
    
    /**
     * Metodo para inicializar bestias
     */
    public void inicializarBestias(){
        int ataque=0;
        int armadura=0;
        int id = 0;
        for(int i=0; i<heroes.length; i++){
            ataque = dado.tirarDado(90, 1);
            armadura = dado.tirarDado(60, 1);
            id = i+1;
            if(i>=0 && i<=7){
                 bestias[i] = new Orco(ataque, id, "Humano", 180, armadura);
            }
            else{
                bestias[i] = new Trasgo(ataque, id, "Hobbit", 200, armadura);
            }
        }
    }
    
    /**
     * Metodo para mostrar los personajes en el sistema
     * @param personajes 
     */
    public void mostrarPersonaje(Personaje[] personajes){
        for(int i=0; i<10; i++){
                personajes[i].mostrarPersonaje();
        }
    }
    
    /**
     * Metodo que envia como parametros los ejercitos de heroes y bestias
     */
    public void mostrarPersonajes(){
        mostrarPersonaje(this.heroes);
        System.out.println("\n");
        mostrarPersonaje(this.bestias);
        System.out.println("\n");
    }
}
