package org.haje.ducks;

import java.awt.*;
import java.awt.event.KeyEvent;

public class MyDecoyDuck extends Duck {

    private int x;
    private int y;

    public MyDecoyDuck(int x, int y){
        super(x,y);
        this.x = x;
        this.y = y;
    }
    @Override
    public void draw(Graphics2D g2d){
        // Body
        g2d.setColor(new Color(139, 69, 19));
        g2d.fillOval(x, y, 120, 80);

        // Head
        g2d.setColor(new Color(139, 69, 19));
        g2d.fillOval(x + 90, y - 30, 60, 60);

        // Beak
        g2d.setColor(Color.BLACK);
        Polygon beak = new Polygon();
        beak.addPoint(x + 140, y);
        beak.addPoint(x + 160, y - 10);
        beak.addPoint(x + 160, y + 10);
        g2d.fill(beak);

        // Eye
        g2d.setColor(Color.BLACK);
        g2d.fillOval(x + 120, y - 10, 10, 10);

        // Highlight
        g2d.setColor(Color.WHITE);
        g2d.fillOval(x + 122, y - 8, 5, 5);

        // Wing
        g2d.setColor(new Color(139, 69, 19));
        g2d.fillArc(x + 20, y + 20, 60, 40, 0, 180);

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

}
