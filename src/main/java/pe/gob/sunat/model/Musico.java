/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.sunat.model;

import java.util.List;

/**
 *
 * @author Alumno
 */
public class Musico {
    
    private int numCanciones;
    private Instrumento instrumento;
    private List<Instrumento> instrumentos;
    
    public Musico(int numCanciones, Instrumento instrumento) {
        this.numCanciones = numCanciones;
        this.instrumento = instrumento;
    }

    public Musico(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    public Musico(){
    }
    
    public Musico(Instrumento instrumento) {
		super();
		this.instrumento = instrumento;
	}

	public void presentacion(){
        System.out.println("Hola soy un musico");
        if(numCanciones > 0){
            System.out.println("\tPuede tocar " + numCanciones + " canciones...");
        }
        if(instrumento != null){
            
            instrumento.sonido();
        }
        if(instrumentos != null && !instrumentos.isEmpty()){
            System.out.println("\t Tambien se tocar otros " 
                                + instrumentos.size()
                                + " instrumentos, estos son: ");
            for(Instrumento inst : instrumentos) {
                 System.out.print("\t - " + inst.getNombre() + " cuyo sonido es: "); inst.sonido();
            }
        }
    }
    
    public int getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    public List<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(List<Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }
    
}
