/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ejerciciovehiculos;

import EjercicioVehiculos.Auto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pabrmo971
 */
public class AutoTest {
    
    public AutoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcularImpuesto method, of class Auto.
     */
     @Test
    public void testCalcularImpuesto() {
      System.out.println("calcularImpuesto");

        //arrange
        Auto instance = new Auto("ford", "puma", 3, 4);
        double expResult = (3 * 100) * 0.05;

        //act
        double result = instance.calcularImpuesto();

        //assert
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of toString method, of class Auto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
    }
    
}
