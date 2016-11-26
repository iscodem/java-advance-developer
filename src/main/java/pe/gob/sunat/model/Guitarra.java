package pe.gob.sunat.model;

public class Guitarra extends Instrumento {
	 public Guitarra(String nombre) {
	        super(nombre);
	    }
	@Override
	public void sonido() {
		System.out.println("truuuunnn");
	}
}
