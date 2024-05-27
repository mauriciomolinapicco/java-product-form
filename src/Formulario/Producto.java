package Formulario;

public class Producto {
	private String nombre;
	private String descripcion;
	private String rubro;
	
	public Producto(String nombre, String descripcion, String rubro) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.rubro = rubro;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getRubro() {
		return rubro;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setRubro(String rubro) {
		this.rubro = rubro;
	}
}
