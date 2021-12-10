package iterator.example.catalogo_productos;

import iterator.example.iterators.DisponibilidadIterator;
import iterator.example.iterators.ProductosIterator;
import iterator.example.productos.Producto;
import iterator.example.usuarios.Vendedor;
import java.util.Collection;

public class CatalogoVendedor implements CatalogoProductos{
    Collection<Producto> productos;
    Vendedor vendedor;
    
    @Override
    public ProductosIterator createIterator() {
        ProductosIterator i = new DisponibilidadIterator(this, vendedor.getTienda());
        return i;
    }
    
}
