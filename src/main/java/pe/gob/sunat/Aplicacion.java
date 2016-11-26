package pe.gob.sunat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.gob.sunat.model.Musico;

public class Aplicacion {
		
	
	 public static void main(String[] args) {
		 ApplicationContext cntx = new ClassPathXmlApplicationContext("app.xml");
		 Aplicacion.ejemploCuatro(cntx);
	    }
	 
	    public static void ejemploDos(ApplicationContext cntx) {
	        Musico musico = (Musico) cntx.getBean("miguel");
	        musico.presentacion();
	                
	    }
	    public static void ejemploBasico(ApplicationContext cntx) {
	        Musico musico = (Musico) cntx.getBean("musico");
	        musico.presentacion();
	    }
	    
	     public static void ejemploTres(ApplicationContext cntx) {
	         Musico musico = (Musico) cntx.getBean("pedro");
	         musico.presentacion();
	     }
	     public static void ejemploCuatro(ApplicationContext cntx) {
	         Musico musico = (Musico) cntx.getBean("charly");
	         musico.presentacion();
	     }
	     
	     public static void ejemploCinco(ApplicationContext cntx) {
	         Musico musico = (Musico) cntx.getBean("cerati");
	         musico.presentacion();
	     }
}
