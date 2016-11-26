package pe.gob.sunat;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.gob.sunat.bean.Programa;
import pe.gob.sunat.dao.ProgramaDAO;

public class ApplicationJdbc {
	public static void main(String[] args) {
		ApplicationContext cntx = new ClassPathXmlApplicationContext("jdbc_db.xml");
		ProgramaDAO dao = (ProgramaDAO) cntx.getBean("programaDAO");
	
		ApplicationJdbc.listar(dao);
		//ApplicationJdbc.guardar(dao);
		//ApplicationJdbc.actualizar(dao);
		//ApplicationJdbc.eliminar(dao);
		
	}

	public static void listar(ProgramaDAO dao) {
		List<Programa> programas = dao.list();
		for (Programa programa : programas) {
			System.out.println(programa.getId() + " " + programa.getNombre().toUpperCase());
		}
	}
	

	public static void guardar(ProgramaDAO dao) {
		Programa programa = new Programa();
		programa.setNombre("Manuel dice: quiero a mi mami... AMANDA");
		programa.setDescripcion("Programa Simple el contenido");
		programa.setCodigo("201");
		dao.save(programa);
	}

	
	public static void actualizar(ProgramaDAO dao) {
		Programa programa = dao.get(new Programa(289l));
		programa.setNombre("jose dejate de hue....das");
		dao.update(programa);
	}

	public static void eliminar(ProgramaDAO dao) {
		Programa programa = dao.get(new Programa(34l));
		dao.delete(programa);
	}
	
}
