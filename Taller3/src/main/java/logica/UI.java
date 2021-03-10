/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import javax.swing.JFrame;

/**
 *
 * @author felip
 */
public class UI extends JFrame{
    private Button b1;
    public UI (){
        super("Health centers in Coquimbo asistance");
        setLayout(new FlowLayout());
        b1 = new Button("ingresar usuario");
        add(b1);
        setSize(400,300);
        b1.setBounds(100,80,30,30);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main (String [] args){
        UI v1 = new UI();
    }
    
    
    
}
