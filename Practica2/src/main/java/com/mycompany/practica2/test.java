/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica2;
 
import Vista.Vista;
import Modelo.Conexion;
import java.sql.SQLException;
/**
 *
 * @author PC01
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        Vista vista = new Vista();
        vista.setVisible(true);
        
       
    }
 
}

