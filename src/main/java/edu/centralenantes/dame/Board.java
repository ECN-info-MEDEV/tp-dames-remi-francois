/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.dame;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                    plateau[x][y] = new Pion(x,y,0,plateau);
                }
            }
        }
        for (int y=9; 6 <= y; y--) {
            for (int x=0; x < 10; x++) {
                if ((x + y) % 2 == 0) {
                    plateau[x][y] = new Pion(x,y,1,plateau);
                }
            }
        }
        turn = 0;
        
    }
    
    
    public Point requestPos() {
        Point pos;
        System.out.println("Sélectionner un pion de la fome : x[ESPACE]y. Appuyez sur [s] pour sauvegarder la partie.");
        String posString = Game.s.nextLine();
        if (posString.equals("s")) {
            try {
                SaveManager.save(this);
                System.out.println("Partie sauvegardée");
            } catch (IOException ex) {
                System.out.println("La sauvegarde a échouée");
            } catch (NullPointerException ex) {
                System.out.println("La sauvegarde a été annulée");
            }
            System.out.println("Sélectionner un pion de la fome : x[ESPACE]y.");
            posString = Game.s.nextLine();
        }
        pos = null;
        try {
            String[] positions = posString.split(" ");
            pos = new Point(Integer.parseInt(positions[0]),Integer.parseInt(positions[1]));
        } catch (Exception e) {}
        if (pos != null ) {
            if (plateau[pos.getX()][pos.getY()] == null || plateau[pos.getX()][pos.getY()].getPlayer() != turn) {
                pos=null;
            }
        }
        return pos;
    }
    
    public void nextTurn() {
        System.out.println(this);
        System.out.println("C'est au tour du joueur "+turn);
        Point pos = null;
        
        boolean cancel = true;
        while (cancel) {
            cancel = false;
            while (pos == null) {
                pos = requestPos();
            }
            System.out.println("Pion "+pos+" sélectionné\n");
            Pion pion = plateau[pos.getX()][pos.getY()];
            pos = null;
            while (pos == null && !cancel) {
                System.out.println("Choisir direction, gauche [g] ou droite [d] ou [c] pour choisir un autre pion");
                String posString = Game.s.nextLine();
                if (posString==null) {
                    pos = null;
                } else if (posString.equals("g")) {
                    pos = new Point(-1,1 - pion.getPlayer()*2);
                } else if (posString.equals("d")) {
                    pos = new Point(1,1 - pion.getPlayer()*2);
                } else if (posString.equals("c")) {
                    cancel = true;
                    pos = null;
                    pion = null;
                }
                if (pos != null && !pion.move(pos)) {
                    pos = null;
                }
            }  
        }
        turn = 1 - turn;
    }
    
    
    
    @Override
    public String toString() {
        String s = "  |";
        for (int i=0; i < 10; i++) {
            s+= i + "  ";
        }
        s+= "\n--";
        for (int i=0; i < 10; i++) {
            s+= "---";
        }
        s+= " \n";
        for (int y=0; y < 10; y++) {
            s+= y + " |";
            for (int x=0; x < 10; x++) {
                
                if (plateau[x][y] != null) {
                    if (plateau[x][y] instanceof Dame) {
                        s += "D" + plateau[x][y].getPlayer() + " ";
                    } else {
                        s += "P" + plateau[x][y].getPlayer() + " ";
                    }
                    
                } else {
                    s += "-- ";
                }
            }
            s += "\n";
        }
        return s;
    }
    
    public Pion[][] getPlateau() {
        return plateau;
    }

    public int getTurn() {
        return turn;
    }

    public void setPlateau(Pion[][] plateau) {
        this.plateau = plateau;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }
    
    
    
}
