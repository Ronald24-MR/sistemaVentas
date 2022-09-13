/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Ronald
 */
public class DetalleVentas {
    int idDetalleVentas;
    int cantidad;
    double precioVenta;
    int idVentas;
    int idProducto;
    
    public DetalleVentas(){
        
    }

    public DetalleVentas(int idDetalleVentas, int cantidad, double precioVenta, int idVentas, int idProducto) {
        this.idDetalleVentas = idDetalleVentas;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.idVentas = idVentas;
        this.idProducto = idProducto;
    }

    public int getIdDetalleVentas() {
        return idDetalleVentas;
    }

    public void setIdDetalleVentas(int idDetalleVentas) {
        this.idDetalleVentas = idDetalleVentas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    
    
}
