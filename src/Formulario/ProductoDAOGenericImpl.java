package Formulario;

import java.util.List;

public class ProductoDAOGenericImpl implements ProductoDAO {
	
	public ProductoDAOGenericImpl() {}

	@Override
	public void crearProducto(Producto producto) {
		String nombre = producto.getNombre();
		
		System.out.println("Producto guardado: " + nombre);
		
	}

	@Override
	public void borrarProducto(String nombreProducto) {
		System.out.println("Producto borrado: " + nombreProducto);
		
	}

	@Override
	public void actualizarProducto(Producto producto) {
		System.out.println("Producto actualizado: " + producto.getNombre());
		
	}

	@Override
	public void mostrarProducto(String nombreProductos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Producto> listarProductos() {
		return null;
	}
}