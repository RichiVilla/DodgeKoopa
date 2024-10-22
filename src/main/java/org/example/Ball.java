package org.example;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
    private int x; // Posición x en el tablero
    private int y; // Posición y en el tablero
    private int diameter; // Diámetro del círculo

    // Constructor
    public Ball(int x, int y, int diameter) {
        this.x = x;
        this.y = y;
        this.diameter = diameter; // Inicializa el diámetro
    }

    // Métodos para obtener las posiciones
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Método para dibujar un círculo azul con borde negro
    public void draw(Graphics g) {
        g.setColor(Color.BLUE); // Color del círculo
        g.fillOval(x - diameter / 2, y - diameter / 2, diameter, diameter); // Dibuja el círculo
        g.setColor(Color.BLACK); // Color del borde
        g.drawOval(x - diameter / 2, y - diameter / 2, diameter, diameter); // Dibuja el borde
    }
}
