/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.MenuPrincipal;

/**
 *
 * @author ezequielpena
 */
public class ControladorMenuPrincipal implements ActionListener {
    MenuPrincipal objMenuPrincipal;
    
    public ControladorMenuPrincipal(){
        
    }
    
    public ControladorMenuPrincipal(MenuPrincipal objMenuPrincipal){
        this.objMenuPrincipal = objMenuPrincipal;
        this.objMenuPrincipal.botonPlay.addActionListener(this);
        this.objMenuPrincipal.botonProfile.addActionListener(this);
        this.objMenuPrincipal.botonSettings.addActionListener(this);
        this.objMenuPrincipal.botonAbout.addActionListener(this);
        this.objMenuPrincipal.botonExit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.objMenuPrincipal.botonPlay){
            // Boton play
            return;
        }
        if(e.getSource()==this.objMenuPrincipal.botonProfile){
            //Boton profile
            return;
        }
        if(e.getSource()==this.objMenuPrincipal.botonSettings){
            //Boton settings
            return;
        }
        if(e.getSource()==this.objMenuPrincipal.botonAbout){
            //Boton about
            return;
        }
        if(e.getSource()==this.objMenuPrincipal.botonExit){
            //Boton exit
            return;
        }
    }

    
}
