package org.haje;

import org.haje.ducks.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class MyDuckGame extends JPanel implements KeyListener {
    private Duck myDuck;
    public MyDuckGame() {
        setFocusable(true);
        addKeyListener(this);
        getRandomDuck();
    }

    private Object getRandomDuck() {
        // TODO: Polymorphism(다형성), Inheritance(상속)
        Random random = new Random();
        int duckType = random.nextInt(4);
        switch (duckType) {
            case 0:
                this.myDuck = new MyMallardDuck(200,200);
                return 0;
            case 1:
                this.myDuck = new MyDecoyDuck(200,200);
                return 0;
            case 2:
                this.myDuck = new MyRedheadDuck(200,200);
                return 0;
            case 3:
                this.myDuck = new MyRubberDuck(200,200);
                return 0;
            default:
                return null;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        // TODO: Polymorphism(다형성), Inheritance(상속)
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        this.myDuck.draw(g2d);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //TODO: 캡슐화(encapsulation)
        //HINT: create method in duck class to move the duck
        this.myDuck.move(e);
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyDuck Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(new DuckGame());
        frame.setVisible(true);
    }
}
