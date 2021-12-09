package Chain;

import java.util.Date;

//clase de producto 
public class Producto {
    private String nombreProducto;
    private int precio;
    private int cantidad;
    private Date fechaCompra;
    private Date fechaDevolucionLimite;
    private boolean estado; //estado del producto para aplicar garantia
    private String garantia;
    private String falla;

    public Producto(String nombreProducto, int precio, int cantidad, Date fechaCompra, Date fechaDevolucionLimite, boolean estado, String garantia, String falla) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fechaCompra = fechaCompra;
        this.fechaDevolucionLimite = fechaDevolucionLimite;
        this.estado = estado;
        this.garantia = garantia;
        this.falla = falla;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaDevolucionLimite() {
        return fechaDevolucionLimite;
    }

    public void setFechaDevolucionLimite(Date fechaDevolucionLimite) {
        this.fechaDevolucionLimite = fechaDevolucionLimite;
    }
    
    public boolean Estado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getFalla() {
        return falla;
    }

    public void setFalla(String falla) {
        this.falla = falla;
    }
  
    
}
