/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.dame;

/**
 *
 * @author remir
 */
public class Board {
    public Pion[][] plateau;
    public int turn;
    
    public Board() {
        plateau = new Pion[10][10];
        for (int y=0; y < 4; y++) {
            for (int x=0; x < 10; x++) {
                if ((x + y) % 2 == 0) {
                    plateau[x][y] = new Pion(x,y,0);
                }
            }
        }
        for (int y=9; 5 <= y; y--) {
            for (int x=0; x < 10; x++) {
                if ((x + y) % 2 == 0) {
                    plateau[x][y] = new Pion(x,y,0);
                }
            }
        }
        
    }
    
    @Override
    public String toString() {
        String s = "";
        for (int y=0; y < 10; y++) {
            for (int x=0; x < 10; x++) {
                
                if (plateau[x][y] != null) {
                    s += plateau[x][y].getPlayer();
                } else {
                    s += "-";
                }
            }
        }
        return s;
    }
    
    
    
}