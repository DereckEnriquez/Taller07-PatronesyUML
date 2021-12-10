package iterator.example.iterators;

import iterator.example.productos.Producto;

public interface ProductosIterator {
    boolean hasNext();
    Producto getNext();
    void reset();
}
