package org.haje.ducks;

import java.awt.event.KeyEvent;
import java.awt.*;

public class Duck extends Things{
    private int x;
    private int y;

    public Duck(int x,int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void move(KeyEvent e){
        int keyCode = e.getKeyCode();
        switch(keyCode) {
            case KeyEvent.VK_W:
                this.y -= 5;
                break;
            case KeyEvent.VK_S:
                this.y += 5;
                break;
            case KeyEvent.VK_A:
                this.x -= 5;
                break;
            case KeyEvent.VK_D:
                this.x += 5;
                break;
        }
    }
    @Override
    public void draw(Graphics2D g2d){

    }
}
