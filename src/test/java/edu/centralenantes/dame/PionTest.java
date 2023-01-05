/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.centralenantes.dame;

import java.util.Arrays;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author remir
 */
public class PionTest {
    
    public PionTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of move method, of class Pion.
     */
    @Test
    public void testMove() {
        Board board = new Board();
        Board result = new Board();
        board.setPlateau(new Pion[10][10]);
        result.setPlateau(new Pion[10][10]);
        Pion p1 = new Pion(0,0,0,board.getPlateau());
        board.getPlateau()[0][0] = p1;
        result.getPlateau()[3][3] = p1;
        
        board.getPlateau()[1][1] = new Pion(1,1,1,board.getPlateau());
        board.getPlateau()[2][2] = new Pion(2,2,1,board.getPlateau());
        
        board.getPlateau()[0][0].move(new Point(1,1));
        
        assertEquals(true, Arrays.deepEquals(board.getPlateau(), result.getPlateau()));
    }

    /**
     * Test of remove method, of class Pion.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Pion[][] plateau = new Pion[10][10];
        Pion instance = new Pion(5, 5, 1, plateau);
        instance.remove();
        assertEquals(null,plateau[5][5]);
    }

    
}
