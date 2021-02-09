
import java.awt.Graphics;

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
    int x = 0;
    int y = 0;
    int xa = 1;
    int ya = 1;
    
    private Game game;
    
    public Ball (Game game){
        this.game = game;
    }

    public void move(){
        if(x+xa < 0){xa = 1;}
        if (x+xa > game.getWidth() -30){xa = -1; }
        if (y+ya <0){ya = 1;}
        if (y +ya < game.getHeight() - 30){ya = -1;}
        x = x +xa;
        y = y+ya;
    }
    public void paint(Graphics g2d){
        g2d.fillOval(x, y, 30, 30);
    }
}
