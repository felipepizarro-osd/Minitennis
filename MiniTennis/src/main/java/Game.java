
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
    Ball ball = new Ball(this);
    Raqueta  R = new Raqueta(this);
    int velocidad = 1;
    private int getScore(){
        return velocidad -1 ;
    }
    public Game(){
        addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                R.keyReleased(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                R.keyPressed(e);
            }
        
        });
        setFocusable(true);
        Sound.BACK.loop();
        
    }
    private void move(){
        ball.move();
        R.move();
    }
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g ;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        ball.paint(g2d);
        R.paint(g2d);
        g2d.setColor(Color.GRAY);
        g2d.setFont(new Font("Verdana",Font.BOLD,30));
        g2d.drawString(String.valueOf(getScore()),10,30);
        
        
    }
    public void gameOver(){
        Sound.BACK.stop();
        Sound.GAMEOVER.play();
        JOptionPane.showMessageDialog(this,"Your Score is: "+getScore(),"Game Over",JOptionPane.YES_NO_OPTION);
        System.exit(ABORT);
    }
    public static void main(String[] args) throws InterruptedException{
        JFrame frame = new JFrame("Mini Tennis ");
        Game game = new Game();
        frame.add(game);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while(true){

            game.move();
            game.repaint();
            Thread.sleep(10);

        }
    }
}
