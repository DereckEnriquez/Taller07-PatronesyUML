package Chain;

import java.util.Date;

public class Producto {
    private String nombreProducto;
    private int precio;
    private int cantidad;
    private Date fechaCompra;
    private Date fechaDevolucionLimite;
    private String cliente;
    private boolean estado; //estado del producto para aplicar garantia
    private String garantia;
}
