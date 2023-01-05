/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.centralenantes.dame;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author inky19
 */
public class Game {
    
    public static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
        //Board b = SaveManager.load();
        Board b = null;
        while (b == null) {
            System.out.println("Bienvenue dans le jeu de Dame. Vous pouvez :\n[n] Commencer une nouvelle partie\n[o] Ouvrir une partie existante");
            switch(s.nextLine()) {
                case ("n") :
                    b = new Board();
                    break;
                case ("o") :
                    b = SaveManager.load();
                    break;
                default :
                    System.out.println("Mauvaise touche entrée");
                    break;
            }
        }

        while(true){
            b.nextTurn();
        }
        
        
        
    }
}
