package iterator.example.catalogo_productos;

import iterator.example.iterators.DefectuososIterator;
import iterator.example.iterators.ProductosIterator;
import iterator.example.productos.Producto;
import java.util.Collection;

public class CatalogoProveedor implements CatalogoProductos{
    Collection<Producto> productos;
    
    @Override
    public ProductosIterator createIterator() {
        ProductosIterator i = new DefectuososIterator(this);
        return i;
    }
    
}
