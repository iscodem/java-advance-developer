package pe.gob.sunat.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import pe.gob.sunat.bean.Programa;
import pe.gob.sunat.conexion.ProgramaRowMapper;

public class ProgramaDAOJ extends JdbcDaoSupport implements ProgramaDAO {
	public List<Programa> list() {
		String sql = "select * from programa";
		return this.getJdbcTemplate().query(sql, new ProgramaRowMapper());
	}

	public Programa get(Programa t) {
		String sql = "select * from programa where id = ?";
		Programa programa = (Programa) this.getJdbcTemplate().queryForObject(sql, new Object[] { t.getId() },
				new ProgramaRowMapper());
		return programa;
	}

	public void save(Programa t) {
		String sql = "insert into programa(nombre,descripcion) values(?,?)";
		try {
			this.getJdbcTemplate().update(sql, new Object[] { t.getNombre(), t.getDescripcion() });
		} catch (DataAccessException e) {
			System.err.println("ERROR: " + e.getMessage());
		}
	}

	public void update(Programa t) {
		String sql = "update programa set nombre=?, descripcion=? where id=? ";
		try {
			this.getJdbcTemplate().update(sql, new Object[] { t.getNombre(), t.getDescripcion(), t.getId() });
		} catch (DataAccessException e) {
			System.err.println("ERROR: " + e.getMessage());
		}
	}

	public void delete(Programa t) {
		this.getJdbcTemplate().update("delete from programa where id=?", new Object[] { t.getId() });
	}
}
