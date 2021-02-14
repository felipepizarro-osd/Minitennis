
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Raqueta {
    private static final int Y = 330;
    private static final int ancho = 60;
    private static final int alto = 10;
    int x = 0;
    int xa = 0;
    private Game game;
         
    public Raqueta(Game game) {
        this.game = game;
        
    }
    public void move(){
        if (x+xa > 0 && x+xa< game.getWidth()- ancho){
            x=x+xa;
        }
    
    }
    public void paint(Graphics g ){
        g.fillRect(x,Y,ancho,alto);
        
    }
    public void keyReleased(KeyEvent e ){
        xa = 0;
        
    }
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            xa = -game.velocidad;
        }
        if(e.getKeyCode()== KeyEvent.VK_RIGHT){
            xa = game.velocidad;
            
        }
    }public Rectangle getBounds(){
        return new Rectangle(x,Y,ancho,alto);
        
    }
    public int getTop(){
        return Y-alto;
    }
}
