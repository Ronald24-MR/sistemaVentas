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
public class EntidadProducto {
    int idProducto;
    String Nombres;
    Double Precio;
    int Stock;
    String Estado;
    
    public EntidadProducto(){
        
    }

    public EntidadProducto(int idProducto, String Nombres, Double Precio, int Stock, String Estado) {
        this.idProducto = idProducto;
        this.Nombres = Nombres;
        this.Precio = Precio;
        this.Stock = Stock;
        this.Estado = Estado;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
    
}
