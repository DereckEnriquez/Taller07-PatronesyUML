package Chain;

public abstract class MainHandler {

    public boolean devolverProducto(Producto p) {
        while (p.Estado() != true) {
            //hasta que no se resuelva el caso el manejador seguira 
            //buscando entre las distintas clases la solucion de la devolucion
        }
        return p.Estado();
    }
}
