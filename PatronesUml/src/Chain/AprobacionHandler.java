package Chain;

public class AprobacionHandler extends MainHandler{
    public boolean Aprobar(Producto p){
        if(p.getPrecio()>1000){
            //se requiere la aprobacion del gerente
            //aprobacion(p);
        }else{
            //no requiere aprobacion y se efectua el cambio
        }
        return false;
    } 
}
