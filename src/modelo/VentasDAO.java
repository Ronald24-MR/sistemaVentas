/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Ronald
 */
public class VentasDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r ;
    
    public String NroSerieVentas(){
        String serie = "";
        String sql = "select max(NumeroSerie) from ventas";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                serie=rs.getString(1);
            }
        }catch(Exception e){
            
        }
        return serie;
    }
    
    public String IdVentas(){
        String idv = "";
        String sql = "select max(IdVentas) from ventas";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                idv = rs.getString(1);
            }
        }catch(Exception e){
            
        }
        return idv;
    }
    
    public int GuardarVentas(EntidadVentas v){
        
        String sql = "insert into ventas(IdCliente,IdVendedor,NumeroSerie,FechaVentas,Monto,Estado)values(?,?,?,?,?,?)";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, v.getIdCliente());
            ps.setInt(2, v.getIdVendedor());
            ps.setString(3, v.getNumeroVentas());
            ps.setString(4, v.getFechaVentas());
            ps.setDouble(5, v.getMonto());
            ps.setString(6, v.getEstado());

            r=ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return r;
    }
    
    public int GuardarDetalleVentas(DetalleVentas dv){
        String sql = "insert into detalle_ventas(IdVentas,IdProducto,Cantidad,PrecioVenta)values(?,?,?,?)";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(3, dv.getCantidad());
            ps.setDouble(4, dv.getPrecioVenta());
            ps.setInt(1, dv.getIdVentas());
            ps.setInt(2, dv.getIdProducto());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();

        }
        return r;
    }
}
