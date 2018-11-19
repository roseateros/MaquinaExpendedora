/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Tarde
 */
public class Maquina extends JFrame implements ActionListener{
private JButton boton1;
    public Formulario() {
    setLayout(null);
    boton1=new JButton(&quot;1&quot;);
    boton1.setBounds(10,100,90,30);
    add(boton1);
    };
    public void actionPerformed(ActionEvent e) {
        
    };
    /**
     * @param args the command line arguments
     */
   public static void main(String[] ar) {
Formulario formulario1=new Formulario();
formulario1.setBounds(0,0,130,140);
formulario1.setVisible(true);
}
    
}
