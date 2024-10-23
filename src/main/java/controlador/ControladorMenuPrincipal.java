/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.MenuPrincipal;

/**
 *
 * @author ezequielpena
 */
public class ControladorMenuPrincipal implements ActionListener,MouseListener {
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
        
        this.objMenuPrincipal.botonPlay.addMouseListener(this);
        this.objMenuPrincipal.botonProfile.addMouseListener(this);
        this.objMenuPrincipal.botonSettings.addMouseListener(this);
        this.objMenuPrincipal.botonAbout.addMouseListener(this);
        this.objMenuPrincipal.botonExit.addMouseListener(this);
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

    @Override
    public void mouseClicked(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()==this.objMenuPrincipal.botonPlay){
            this.objMenuPrincipal.botonPlay.setBackground(Color.GREEN);
            return;
        }
        if(e.getSource()==this.objMenuPrincipal.botonProfile){
            this.objMenuPrincipal.botonProfile.setBackground(Color.GREEN);
            return;
        }
        if(e.getSource()==this.objMenuPrincipal.botonSettings){
            this.objMenuPrincipal.botonSettings.setBackground(Color.GREEN);
            return;
        }
        if(e.getSource()==this.objMenuPrincipal.botonAbout){
            this.objMenuPrincipal.botonAbout.setBackground(Color.GREEN);
            return;
        }
        if(e.getSource()==this.objMenuPrincipal.botonExit){
            this.objMenuPrincipal.botonExit.setBackground(Color.GREEN);
            return;
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource()==this.objMenuPrincipal.botonPlay){
            this.objMenuPrincipal.botonPlay.setBackground(Color.YELLOW);
            return;
        }
        if(e.getSource()==this.objMenuPrincipal.botonProfile){
            this.objMenuPrincipal.botonProfile.setBackground(Color.YELLOW);
            return;
        }
        if(e.getSource()==this.objMenuPrincipal.botonSettings){
            this.objMenuPrincipal.botonSettings.setBackground(Color.YELLOW);
            return;
        }
        if(e.getSource()==this.objMenuPrincipal.botonAbout){
            this.objMenuPrincipal.botonAbout.setBackground(Color.YELLOW);
            return;
        }
        if(e.getSource()==this.objMenuPrincipal.botonExit){
            this.objMenuPrincipal.botonExit.setBackground(Color.YELLOW);
            return;
        }
    }

    
}
