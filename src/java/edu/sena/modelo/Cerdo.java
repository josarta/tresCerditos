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
public class Cerdo extends Animal  {
    private String instrumento;
    private Casa casa;

    public Cerdo() {
    }

    public Cerdo(String instrumento, Casa casa, String nombre) {
        super(nombre);
        this.instrumento = instrumento;
        this.casa = casa;
    }

    public Cerdo(String instrumento, Casa casa, String nombre, String tamanio, String personalidad) {
        super(nombre, tamanio, personalidad);
        this.instrumento = instrumento;
        this.casa = casa;
    }
    
    
    public String cantar(){
        return "El cerdo con nombre : " + this.getNombre() + " canta  !!!!!! Quien teme al lobo feroz..";
    }
    
    public String bailar( String tipoDebaile){
        return "El cerdo " + this.getNombre() + " baila " + tipoDebaile;
    }
    
    public String construir(){
        return "El cerdo " + this.getNombre() + " Construye casa de material " + this.casa.getMaterial();
    }
    
    public String tocarInstrumento(){
        return "El cerdo " + this.getNombre() + " toca el instrumento " + this.instrumento;
    }
    
    
    
    
    
    
    

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }
    
}
