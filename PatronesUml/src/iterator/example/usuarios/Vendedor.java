package iterator.example.usuarios;

import iterator.example.tienda.Tienda;

public class Vendedor {
    //Atributos...
    private Tienda tienda;

    public Vendedor(Tienda tienda) {
        this.tienda = tienda;
    }

    public Tienda getTienda() {
        return tienda;
    }
    
}
