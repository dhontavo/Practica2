/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import Modelo.Conexion;


/**
 *
 * @author PC01
 */
public class Modelo {
    private Conexion conexion= new Conexion();
    
    public boolean InsertarProveedor(String NOMBRE_I, String APELLIDOP_I, String APELLIDOM_I, String CALLE_I, String NUMERO_I, String COLONIA_I) throws SQLException{
        try{
            Connection con= conexion.abrirConexion(); 
            Statement s= con.createStatement(); 
            int registro =s.executeUpdate("EXEC GUARDAR_DISTRIBUIDOR 1" +
                    "REPLACE(REPLACE(REPLACE(NOW(),'-',''),' ' ,''),':','')" +
                    ""+NOMBRE_I+"," +
                    ""+APELLIDOP_I+"," +
                    ""+APELLIDOM_I+"," +
                    ""+CALLE_I+"," +
                    ""+NUMERO_I+"," +
                    ""+COLONIA_I+""); 
            conexion.cerrarConexion(con); 
            return true; 
        }
        catch(SQLException e)
        {
          return false;    
        }
    }
    
    public boolean BuscarProveedor(String ID)throws SQLException{
        try{
            Connection con= conexion.abrirConexion(); 
            Statement s= con.createStatement(); 
            int registro =s.executeUpdate("SELECT "); 
            conexion.cerrarConexion(con); 
            return true; 
        }
        catch(SQLException e)
        {
          return false;    
        }
    }
}
