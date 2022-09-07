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
public class EntidadVendedor {
    int idVendedor;
    String Dni;
    String Nombres;
    int Telefono;
    String Estado;
    String User2;
    
    public EntidadVendedor(){
      
    }

    public EntidadVendedor(int idVendedor, String Dni, String Nombres, int Telefono, String Estado, String User2) {
        this.idVendedor = idVendedor;
        this.Dni = Dni;
        this.Nombres = Nombres;
        this.Telefono = Telefono;
        this.Estado = Estado;
        this.User2 = User2;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
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

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getUser2() {
        return User2;
    }

    public void setUser2(String User2) {
        this.User2 = User2;
    }
    
    
}
