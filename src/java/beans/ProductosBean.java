
package beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.Producto;

@ManagedBean(name = "productosBean")
@RequestScoped
public class ProductosBean {

    private List<Producto> productos;

    public ProductosBean() {
        productos = new ArrayList<Producto>();
        productos.add(new Producto(501, "Lego", "Ambulancia", 150));
        productos.add(new Producto(502, "Tambor", "De plástico", 150));
        productos.add(new Producto(503, "Avión", "Control remoto", 150));
        productos.add(new Producto(504, "Coche", "De plátisco", 150));
        productos.add(new Producto(505, "Helicoptero", "Usa pilas", 150));
        productos.add(new Producto(506, "Motocicleta", "Mediana", 150));
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
