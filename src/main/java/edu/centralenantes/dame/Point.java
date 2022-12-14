/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package edu.centralenantes.dame;

/**
 *
 * @author inky19
 */
public class Point {

    private int x;
    private int y;

    public Point(){
        x = 0;
        y = 0;
    }
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * Vérifie que le point se situe bien dans le plateau.
     * @return Si le point est valide.
     */
    public boolean isValid(){
        return ((Math.abs(x-4.5) <= 4.5) && (Math.abs(y-4.5) <= 4.5));
    }
    
    public String toString(){
        return String.valueOf(x) + SaveManager.SEP + String.valueOf(y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Point other = (Point) obj;
        if (this.x != other.x) {
            return false;
        }
        return this.y == other.y;
    }
    
    
    
}
