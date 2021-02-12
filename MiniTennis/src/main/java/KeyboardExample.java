
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
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
public class KeyboardExample extends JPanel {
    public KeyboardExample(){
        KeyListener listener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                
                System.out.println("KeyPressed= "+ KeyEvent.getKeyText(e.getKeyCode()));
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("KeyPressed= "+ KeyEvent.getKeyText(e.getKeyCode()));
                
            }
        };
        addKeyListener(listener);
        setFocusable(true);
    }
    
    public static void main(String[] args){
        JFrame frame = new JFrame("Mini Tennis");
        KeyboardExample keyboard = new KeyboardExample(); 
        frame.add(keyboard);
        frame.setSize(200,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
