
import java.awt.Graphics;
import java.awt.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
class Ball {
    private static final int DIAMETRO = 30;
    int x = 0;
    int y = 0;
    int xa = 1;
    int ya = 1;
    
    private Game game;
    
    public Ball (Game game){
        this.game = game;
    }

    public void move(){
        boolean cambiarDireccion = true;
        
        if(x+xa < 0){xa = 1;}
        if (x+xa > game.getWidth() -DIAMETRO){xa = -1; }
        if (y+ya < 0){ya = 1;}
        if (y +ya > game.getHeight() - DIAMETRO){ya = -1;
        game.gameOver();
        }
        if (collision()){
            ya = -1;
            y = game.R.getTop()-DIAMETRO;
            game.velocidad++;
        }else{
            cambiarDireccion = false;
            
        }if (cambiarDireccion ){
            Sound.BALL.play();
        }
        x = x +xa;
        y = y+ya;
    }
    private boolean collision(){
        return game.R.getBounds().intersects(getBounds());
        
    }
    private Rectangle getBounds(){
        return new Rectangle(x,y,DIAMETRO,DIAMETRO);
    }
    public void paint(Graphics g2d){
        g2d.fillOval(x, y, DIAMETRO, DIAMETRO);
    }
}
