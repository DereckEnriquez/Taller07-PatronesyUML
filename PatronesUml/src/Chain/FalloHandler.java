package Chain;

public class FalloHandler extends MainHandler{
    public boolean fallaCubierta(Producto p){
        if(p.getFalla().equals(p.getGarantia())){
         //verifica la existencia del fallo y que este cubierto por la garantia
        }
        return false;
    }
}
