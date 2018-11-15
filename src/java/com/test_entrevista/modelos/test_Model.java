
package com.test_entrevista.modelos;

import javax.ejb.Stateless;



public class test_Model {
    private String nombre;
    private String correo;
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String n){
        this.nombre=n;
    }
    public String getCorreo(){
        return this.correo;
    }
    
    public void setCorreo(String c){
        this.correo=c;
    }
    
}
