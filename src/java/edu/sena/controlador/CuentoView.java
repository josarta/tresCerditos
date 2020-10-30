/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.controlador;

import edu.sena.modelo.Casa;
import java.io.Serializable;
import java.util.ArrayList;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Usuario
 */
@Named(value = "cuentoView")
@ViewScoped
public class CuentoView implements Serializable{
    private Casa objCasa = new Casa();
    private ArrayList<Casa> listaCasas = new ArrayList<>();
    
        
    /**
     * Creates a new instance of CuentoView
     */
    public CuentoView() {
    }
    
    public void crearCasa(){
      listaCasas.add(new Casa(objCasa.getMaterial(), objCasa.getResistencia()));
    }
    

    public Casa getObjCasa() {
        return objCasa;
    }

    public void setObjCasa(Casa objCasa) {
        this.objCasa = objCasa;
    }

    public ArrayList<Casa> getListaCasas() {
        return listaCasas;
    }

    public void setListaCasas(ArrayList<Casa> listaCasas) {
        this.listaCasas = listaCasas;
    }
    
    
    
    
    
    
}
