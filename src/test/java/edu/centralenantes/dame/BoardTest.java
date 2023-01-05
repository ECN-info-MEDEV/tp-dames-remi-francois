/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.centralenantes.dame;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author remir
 */
public class BoardTest {
    
    public BoardTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of toString method, of class Board.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Board instance = new Board();
        instance.getPlateau()[0][0] = new Pion(0, 0, 1, instance.getPlateau());
        String expResult = 
        "  |0  1  2  3  4  5  6  7  8  9  \n" +
        "-------------------------------- \n" +
        "0 |P1 -- P0 -- P0 -- P0 -- P0 -- \n" +
        "1 |-- P0 -- P0 -- P0 -- P0 -- P0 \n" +
        "2 |P0 -- P0 -- P0 -- P0 -- P0 -- \n" +
        "3 |-- P0 -- P0 -- P0 -- P0 -- P0 \n" +
        "4 |-- -- -- -- -- -- -- -- -- -- \n" +
        "5 |-- -- -- -- -- -- -- -- -- -- \n" +
        "6 |P1 -- P1 -- P1 -- P1 -- P1 -- \n" +
        "7 |-- P1 -- P1 -- P1 -- P1 -- P1 \n" +
        "8 |P1 -- P1 -- P1 -- P1 -- P1 -- \n" +
        "9 |-- P1 -- P1 -- P1 -- P1 -- P1 \n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
