/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Modelo; 
import Vista.Vista; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.awt.event.MouseEvent; 
import java.awt.event.MouseListener; 
import java.sql.SQLException;
import javax.swing.JFrame; 
import javax.swing.JOptionPane;
import javax.swing.event.AncestorListener;

/**
 *
 * @author PC01
 */
public class controlador {
    
    private Modelo modelo;
    private Vista vista;
    
    public controlador(Modelo  modelo, Vista vista)
    {
        this.modelo= modelo; 
        this.vista= vista; 
        this.vista.BtnGuardar.addMouseListener((MouseListener) this);
        this.vista.btnBuscar.addActionListener((ActionListener) this);
        
    }
    
    

    public void actionPerformed(ActionEvent evento) throws SQLException {
         if(this.vista.BtnGuardar == evento.getSource()){
            if(modelo.InsertarProveedor(this.vista.TxtNombre.getText(), this.vista.TxtApaterno.getText(), this.vista.TxtAmaterno.getText(), 
                    this.vista.TxtCalle.getText(), this.vista.TxtNumero.getText(), this.vista.TxtColonia.getText()))
           {
               JOptionPane.showMessageDialog(null, "Registro agregado exitosamente");
               
               this.vista.Limpiar();
           }
        }
    }
    
}
