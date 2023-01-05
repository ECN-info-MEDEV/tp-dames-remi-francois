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
        System.out.println("move");
        Point dep = null;
        Pion instance = new Pion();
        boolean expResult = false;
        boolean result = instance.move(dep);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Pion.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Pion[][] plateau = new Pion[10][10];
        Pion instance = new Pion(5, 5, 1, plateau);
        plateau[5][5].remove();
        instance.remove();
        assertEquals(null,plateau[5][5]);
    }

    
}
