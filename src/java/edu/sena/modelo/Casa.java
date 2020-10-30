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
public class Casa {
    
    private String material;
    private String resistencia;

    public Casa() {
    }

    public Casa(String material, String resistencia) {
        this.material = material;
        this.resistencia = resistencia;
    }
    
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }
    
    
    
}
