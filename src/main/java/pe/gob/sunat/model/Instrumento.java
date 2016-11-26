/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.sunat.model;

/**
 *
 * @author Alumno
 */
public class Instrumento {
    
    private String nombre;
    private String compejidad;

    public Instrumento(){
        
    }
        
    public Instrumento(String nombre) {
        this.nombre = nombre;
    }
   
    
    public void sonido() {
        System.out.println("sonido de instrumento");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

	public String getCompejidad() {
		return compejidad;
	}

	public void setCompejidad(String compejidad) {
		this.compejidad = compejidad;
	}
    
}
