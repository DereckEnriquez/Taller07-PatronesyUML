package Chain;

public class GarantiaHandler extends MainHandler{
    
    public boolean tieneGarantia(Producto p){
        if(p.getFechaCompra().before(p.getFechaDevolucionLimite())){
            //comprueba la garantia y procede a buscar un fallo
        }
        return false;
    }
}
