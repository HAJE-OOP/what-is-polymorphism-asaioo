package org.haje.ducks;

import java.awt.*;
import java.awt.event.KeyEvent;


public class Wave extends Things{
    private int x;
    private int y;

    public Wave(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D g2d){
        g2d.setColor(Color.BLUE);
        g2d.fillOval(x, y, 200, 100);
    }

    @Override
    public void move(KeyEvent e){

    }



}
