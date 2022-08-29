/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.*; 
/**
 *
 * @author Fabiola Paez
 */
public class Conexion {
    
    public Connection abrirConexion() throws SQLException
    {
        Connection con; 
        // Para conectar a una base de datos 
        // Cargar la libreria 
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver()); 
            con = DriverManager.getConnection("jdbc:mysql://localhost:root/practica_dp", "root", ""); 
        }
        catch(SQLException e)
        {
            System.out.println("No se puede abrir conexión");
            con= null; 
        }
        return con; 
    }
    
    public void cerrarConexion(Connection c)
        throws SQLException{
            try 
            {
                if(!c.isClosed())
                {
                    c.close();
                }
            }catch (SQLException e)
            {
                System.out.println("Error al cerrar la conexion");
            }
        } 
}

