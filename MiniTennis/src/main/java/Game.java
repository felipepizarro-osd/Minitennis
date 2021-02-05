
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Game extends JPanel{
        
    public void paint(Graphics g){
        
        
    }
       public static void main(String[] args){
           JFrame frame = new JFrame("Mini Tennis ");
           frame.setSize(300,300);
           frame.setVisible(true);
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
       }
}
