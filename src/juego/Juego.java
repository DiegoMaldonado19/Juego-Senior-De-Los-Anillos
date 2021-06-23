/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import personajes.VectorPersonajes;
import personajes.bestia.Bestia;
import personajes.heroe.Heroe;
import juego.Dado;
import personajes.bestia.orco.Orco;
import personajes.bestia.trasgo.Trasgo;
import personajes.heroe.elfo.Elfo;
import personajes.heroe.hobbit.Hobbit;

/**
 *
 * @author Diego Maldonado
 */
public class Juego {
    /**
     * Clase juego que se encarga de controlar toda la logica del juego
     */
    VectorPersonajes personajes = new VectorPersonajes();
    Dado dado = new Dado();
    
    public Juego(){
    }
    
    /**
     * Metodo para iniciar el juego
     */
   public void iniciarJuego(){
       
       personajes.inicializarBestias();
       personajes.inicializarHeroes();
       personajes.mostrarPersonajes();
       batalla(personajes.getHeroes(), personajes.getBestias());
   }
   
   /**
    * Metodo batalla en el cual se desarrolla toda la logica de la batalla entre ejercitos
    * @param heroes, arreglo de heroes
    * @param bestias , arreglo de bestias
    */
   public void batalla(Heroe[] heroes, Bestia[] bestias){
        int aleatorioHeroe=0, aleatorioBestia=0;
        int cantidadPersonajesVivos = 10;
        boolean ganador = false;
        while(cantidadPersonajesVivos!=0){
            for(int i=0; i<cantidadPersonajesVivos; i++){
            System.out.println("Pelea, turno: "+(i+1));
            System.out.println(heroes[i].getNombre()+" vs "+bestias[i].getNombre());
            System.out.println(heroes[i].getNombre()+", vida: "+heroes[i].getVida());
            System.out.println(bestias[i].getNombre()+", vida: "+bestias[i].getVida());
            System.out.println("\n\n");
            aleatorioHeroe = dado.tirarDado(100, 2);
            aleatorioBestia = dado.tirarDado(90, 1);
            heroes[i].setAtaque(aleatorioHeroe);
            bestias[i].setAtaque(aleatorioBestia);
            if(heroes[0].isVivo()==true){
                if(heroes[i] instanceof Elfo && bestias[i] instanceof Orco){
                    int disminucion=0;
                    disminucion = (int)(heroes[i].getArmadura()*(1/100));
                    heroes[i].setArmadura(heroes[i].getArmadura()-disminucion);
                    heroes[i].setAtaque(heroes[i].getAtaque()+10);
                    if(heroes[i].getAtaque()>bestias[i].getArmadura()){
                        bestias[i].setVida(bestias[i].getVida()-(heroes[i].getAtaque()-bestias[i].getArmadura()));
                        System.out.println("Elfo atacó Orco, ganó Elfo");
                    }
                    else if(bestias[i].getAtaque()>heroes[i].getArmadura()){
                        heroes[i].setVida(heroes[i].getVida()-(bestias[i].getAtaque()-heroes[i].getArmadura()));
                        System.out.println("Orco atacó Elfo, ganó Orco");
                    }
                }
                else if(heroes[i] instanceof Hobbit && bestias[i] instanceof Trasgo){
                    heroes[i].setArmadura(heroes[i].getArmadura()-5);
                    if(heroes[i].getAtaque()>bestias[i].getArmadura()){
                       bestias[i].setVida(bestias[i].getVida()-(heroes[i].getAtaque()-bestias[i].getArmadura()));
                        System.out.println("Hobbit atacó a Trasgo, ganó hobbit");
                    }
                    else if(bestias[i].getAtaque()>heroes[i].getArmadura()){
                        heroes[i].setVida(heroes[i].getVida()-(bestias[i].getAtaque()-heroes[i].getArmadura()));
                        System.out.println("Trasgo atacó a Hobbit, ganó Trasgo");
                    }
                }
                else if(bestias[i] instanceof Orco){
                    int disminucion=0;
                    disminucion = (int)(heroes[i].getArmadura()*(1/100));
                    heroes[i].setArmadura(heroes[i].getArmadura()-disminucion);
                    if(heroes[i].getAtaque()>bestias[i].getArmadura()){
                        bestias[i].setVida(bestias[i].getVida()-(heroes[i].getAtaque()-bestias[i].getArmadura()));
                        System.out.println("Heroe atacó Orco, ganó Heroe");
                    }
                    else if(bestias[i].getAtaque()>heroes[i].getArmadura()){
                        heroes[i].setVida(heroes[i].getVida()-(bestias[i].getAtaque()-heroes[i].getArmadura()));
                           System.out.println("Orco atacó Heroe, ganó Orco");
                        }
                    }
                else{
                    if(heroes[i].getAtaque()>bestias[i].getArmadura()){
                        bestias[i].setVida(bestias[i].getVida()-(heroes[i].getAtaque()-bestias[i].getArmadura()));
                        System.out.println("Heroe atacó Bestia, ganó Heroe");
                    }
                    else if(bestias[i].getAtaque()>heroes[i].getArmadura()){
                        heroes[i].setVida(heroes[i].getVida()-(bestias[i].getAtaque()-heroes[i].getArmadura()));
                        System.out.println("Bestia atacó Heroe, ganó Bestia");
                    }
                }
            }
            else if(heroes[0].isVivo()==false){
                    ganador=true;
                }
            }
            cantidadPersonajesVivos = revisarMuerte(cantidadPersonajesVivos,heroes, bestias);
        }
        System.out.println("Batalla terminada............");
        if(heroes[0].isVivo()==true){
            System.out.println("Ganaron los Heroes!");
        }
        else if(heroes[0].isVivo()==true){
            System.out.println("Ganaron las Bestias!");
        }
    }
   
   /**
    * Metodo para revisar que personajes estan vivos o muertos 
    * @param personajesVivos, cantidad de personajes vivos
    * @param heroes, arreglo de heroes
    * @param bestias, arreglo de bestias
    * @return 
    */
    public int revisarMuerte(int personajesVivos, Heroe[] heroes, Bestia[] bestias){
        for(int i=0; i<personajesVivos; i++){
                if(heroes[i].getVida()<=0 ){
                    heroes[i].setVivo(false);
                    personajesVivos--;
                }
                else if(bestias[i].getVida()<=0){
                    bestias[i].setVivo(false);
                    personajesVivos--;
                }
        }
        return personajesVivos;
    }
}
