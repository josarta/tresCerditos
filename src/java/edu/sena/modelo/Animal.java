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
public class Animal {

    private String nombre;
    private String tamanio;
    private String personalidad;

    public Animal() {
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public Animal(String nombre, String tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
    }

    public Animal(String nombre, String tamanio , String personalidad) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.personalidad = personalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

}









