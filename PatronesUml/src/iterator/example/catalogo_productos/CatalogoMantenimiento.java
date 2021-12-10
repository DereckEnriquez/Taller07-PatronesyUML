package iterator.example.catalogo_productos;

import iterator.example.iterators.ProductosIterator;
import iterator.example.iterators.ReparacionIterator;
import iterator.example.productos.Producto;
import java.util.Collection;

public class CatalogoMantenimiento implements CatalogoProductos{
    Collection<Producto> productos;
    
    @Override
    public ProductosIterator createIterator() {
        ProductosIterator i = new ReparacionIterator(this);
        return i;
    }
    
}
