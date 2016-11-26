package pe.gob.sunat.bean;

public class Programa {

    private Long id;
    private String nombre;
    private String descripcion;
    private String codigo;

    
    public Programa() {
		super();
	}

	public String getCodigo() {
		return codigo;
	}

	
	public Programa(Long id) {
		super();
		this.id = id;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
