package org.haje.ducks;

import java.awt.*;
import java.awt.event.KeyEvent;

public abstract class Things {
    private int x;
    private int y;


    public abstract void draw(Graphics2D g2d);

    public abstract void move(KeyEvent e);
}
