package Formulario;
import java.util.List;

public interface ProductoDAO {
	void crearProducto(Producto producto);
	
	void borrarProducto(String nombreProducto);
	
	void actualizarProducto(Producto producto);
	
	void mostrarProducto(String nombreProductos);
	
	List<Producto> listarProductos();
}
