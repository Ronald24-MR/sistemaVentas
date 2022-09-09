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
public class EntidadCliente {
    int idCliente;
    String Dni;
    String Nombres;
    String Direccion;
    String Estado;
    
    public EntidadCliente(){
        
    }

    public EntidadCliente(int idCliente, String Dni, String Nombres, String Direccion, String Estado) {
        this.idCliente = idCliente;
        this.Dni = Dni;
        this.Nombres = Nombres;
        this.Direccion = Direccion;
        this.Estado = Estado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
}
