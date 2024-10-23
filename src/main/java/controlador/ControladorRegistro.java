/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Registrarse;

/**
 *
 * @author ezequielpena
 */
public class ControladorRegistro implements ActionListener{
    Registrarse objRegistrarse;
    public ControladorRegistro(){
        
    }
    
    public ControladorRegistro(Registrarse objRegistrarse){
        this.objRegistrarse = objRegistrarse;
        this.objRegistrarse.botonRegistrarse.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.objRegistrarse.botonRegistrarse){
            // se hacen las validaciones pertinentes y se registra el usuario
            // si todo es correcto
            return;
        }
    }
    
}
