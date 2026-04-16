/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Actividad_12_15;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pabrmo971
 */
public class TiendaRepuestoTest {
    
    public TiendaRepuestoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class TiendaRepuesto.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TiendaRepuesto.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarMenu method, of class TiendaRepuesto.
     */
    @Test
    public void testMostrarMenu() {
        System.out.println("mostrarMenu");
        int expResult = 0;
        int result = TiendaRepuesto.mostrarMenu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of altaProducto method, of class TiendaRepuesto.
     */
    @Test
    public void testAltaProducto() {
        System.out.println("altaProducto");
        TiendaRepuesto.altaProducto();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bajaProducto method, of class TiendaRepuesto.
     */
    @Test
    public void testBajaProducto() {
        System.out.println("bajaProducto");
        TiendaRepuesto.bajaProducto();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarStock method, of class TiendaRepuesto.
     */
    @Test
    public void testModificarStock() {
        System.out.println("modificarStock");
        TiendaRepuesto.modificarStock();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarExistencias method, of class TiendaRepuesto.
     */
    @Test
    public void testListarExistencias() {
        System.out.println("listarExistencias");
        TiendaRepuesto.listarExistencias();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
