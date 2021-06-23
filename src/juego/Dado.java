/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author Diego Maldonado
 */
public class Dado {
    /**
     * Clase dado para lanzar el dado
     */
    public Dado(){
    
    }
    
    /**
     * Metodo para tirar el dado y retornar el numero aleatorio
     * @param valorMaximo , valor maximo que retornara nuestra funcion random
     * @param cantidadDados , cantidad de dados que se tiraran
     * @return 
     */
    public int tirarDado(int valorMaximo, int cantidadDados){
        int aleatorio1=0;
        int aleatorio2=0;
        int dado=0;
        for(int i=1; i<=cantidadDados; i++){
            aleatorio1 = (int)(Math.random()*valorMaximo);
            aleatorio2 = aleatorio1;
            if(aleatorio2<aleatorio1){
                dado = aleatorio1;
            }
            else if(aleatorio2>aleatorio1){
                dado = aleatorio2;
            }
            else{
                dado = aleatorio1;
            }
        }
        return dado;
    }
}
