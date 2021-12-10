package iterator.example.iterators;

import iterator.example.productos.Producto;
import iterator.example.catalogo_productos.CatalogoProductos;
import iterator.example.tienda.Tienda;

public class DisponibilidadIterator implements ProductosIterator{
    private CatalogoProductos catalogo;
    private Producto iterationState;
    private Tienda tienda;

    public DisponibilidadIterator(CatalogoProductos catalogo, Tienda tienda) {
        this.catalogo = catalogo;
        this.tienda = tienda;
        loadNext();
    }

    public DisponibilidadIterator(CatalogoProductos catalogo) {
        this(catalogo,null);
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

