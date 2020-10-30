/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.modelo;

/**
 *
 * @author Usuario
 */
public class Lobo extends Animal {

    public Lobo() {
    }

    public Lobo(String nombre) {
        super(nombre);
    }
    
    public Lobo(String nombre , String tamanio) {
        super(nombre, tamanio);        
    }
    
    
    public Lobo(String nombre , String tamanio , String personalidad) {
        super(nombre, tamanio, personalidad);        
    }
    
    public String soplar( Cerdo cerdo ) {
        return "El lobo " + this.getNombre() + " Sopla la casa del cerdo" + cerdo.getNombre() 
                + "con el material " + cerdo.getCasa().getMaterial() ;
    }
    
    
    

}
