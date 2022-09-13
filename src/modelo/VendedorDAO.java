/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ronald
 */
public class VendedorDAO implements CRUD {
    PreparedStatement ps;
    ResultSet rs;
    
    Conexion con = new Conexion();
    Connection acceso;
    
    public EntidadVendedor ValidarVendedor(String dni, String user){
        EntidadVendedor ev = new EntidadVendedor();
        
        String sql="select * from vendedor where Dni=? and User2=?";
        try {
             acceso=con.Conectar();
             ps=acceso.prepareStatement(sql);
             ps.setString(1, dni);
             ps.setString(2, user);
             rs=ps.executeQuery();
             while(rs.next()){
                 ev.setIdVendedor(rs.getInt(1));
                 ev.setDni(rs.getString(2));
                 ev.setNombres(rs.getString(3));
                 ev.setTelefono(rs.getInt(4));
                 ev.setEstado(rs.getString(5));
                 ev.setUser2(rs.getString(6));
        }
        } catch (Exception e) {
            
        }
        
        
        return ev;
    }

    @Override
    public List listar() {
        List<EntidadVendedor>lista=new ArrayList<>();
         String sql="select * from vendedor";
         
         try{
             acceso=con.Conectar();
             ps=acceso.prepareStatement(sql);
             rs=ps.executeQuery();
             while(rs.next()){
                 EntidadVendedor c = new EntidadVendedor();
                 c.setIdVendedor(rs.getInt(1));
                 c.setDni(rs.getString(2));
                 c.setNombres(rs.getString(3));
                 c.setTelefono(rs.getInt(4));
                 c.setEstado(rs.getString(5));
                 c.setUser2(rs.getString(6));
                 lista.add(c);
             }
         }catch(Exception e){    
         }
         return lista;  
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into vendedor(Dni,Nombres,Telefono,Estado,User2)values(?,?,?,?,?)";
        try{
            acceso=con.Conectar();
            ps=acceso.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r=ps.executeUpdate();
        } catch(Exception e){
            
        }
        return r;    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0; 
        String sql = "update vendedor set Dni=?,Nombres=?,Telefono=?,Estado=?,User2=? where IdVendedor=?";
        try{
           acceso=con.Conectar();
           ps=acceso.prepareStatement(sql);
           ps.setObject(1, o[0]);
           ps.setObject(2, o[1]);
           ps.setObject(3, o[2]);
           ps.setObject(4, o[3]);
           ps.setObject(5, o[4]);
           ps.setObject(6, o[5]);
           ps.executeUpdate();
        }catch(Exception e){
            
        }
        return r;    }

    @Override
    public void eliminar(int id) {
        String sql = "delete from vendedor where IdVendedor=?";
        try{
            acceso=con.Conectar();
            ps=acceso.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        }catch(Exception e){
            
        }     }
}
