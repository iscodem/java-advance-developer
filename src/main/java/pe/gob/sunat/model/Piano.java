package pe.gob.sunat.model;

public class Piano extends Instrumento {
	 public Piano(String nombre) {
	        super(nombre);
	    }

	@Override
	public void sonido() {
		System.out.println("buuunnnn");
	}
}
