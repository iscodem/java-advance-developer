package pe.gob.sunat.dao;

import java.util.List;

import pe.gob.sunat.bean.Programa;

public interface ProgramaDAO {
	public List<Programa> list();

	public Programa get(Programa t);

	public void save(Programa t);

	public void update(Programa t);

	public void delete(Programa t);
	
}
