package iterator.example.catalogo_productos;

import iterator.example.iterators.DisponibilidadIterator;
import iterator.example.iterators.ProductosIterator;
import iterator.example.productos.Producto;
import java.util.Collection;

public class CatalogoComprador implements CatalogoProductos{
    Collection<Producto> productos;
    
    @Override
    public ProductosIterator createIterator() {
        ProductosIterator i = new DisponibilidadIterator(this);
        return i;
    }
    
}