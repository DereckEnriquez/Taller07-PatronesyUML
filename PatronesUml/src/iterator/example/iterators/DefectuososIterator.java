package iterator.example.iterators;

import iterator.example.productos.Producto;
import iterator.example.catalogo_productos.CatalogoProductos;

public class DefectuososIterator implements ProductosIterator{
    private CatalogoProductos catalogo;
    private Producto iterationState;

    public DefectuososIterator(CatalogoProductos catalogo) {
        this.catalogo = catalogo;
        loadNext();
    }
    
    
    private void loadNext() {
        iterationState = null;
    }
    
    @Override
    public boolean hasNext() {
        if(iterationState != null)
            return false;
        return true;
    }

    @Override
    public Producto getNext() {
        return iterationState;
    }

    @Override
    public void reset() {
        //vuelve al valor inicial
    }
    
}

