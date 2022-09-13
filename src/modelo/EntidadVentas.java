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
public class EntidadVentas {
    int idVentas;
    String numeroVentas;
    String fechaVentas;
    double monto;
    String estado;
    int idVendedor;
    int idCliente;
    
    public EntidadVentas(){
        
    }

    public EntidadVentas(int idVentas, String numeroVentas, String fechaVentas, double monto, String estado, int idVendedor, int idCliente) {
        this.idVentas = idVentas;
        this.numeroVentas = numeroVentas;
        this.fechaVentas = fechaVentas;
        this.monto = monto;
        this.estado = estado;
        this.idVendedor = idVendedor;
        this.idCliente = idCliente;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public String getNumeroVentas() {
        return numeroVentas;
    }

    public void setNumeroVentas(String numeroVentas) {
        this.numeroVentas = numeroVentas;
    }

    public String getFechaVentas() {
        return fechaVentas;
    }

    public void setFechaVentas(String fechaVentas) {
        this.fechaVentas = fechaVentas;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    
}
