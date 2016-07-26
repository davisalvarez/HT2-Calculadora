/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marlon
 */
public class CalculadoraIT {
    
    public CalculadoraIT() {
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
     * Test of lectorArchivo method, of class Calculadora.
     */
    @Test
    public void testLectorArchivo() {
        System.out.println("lectorArchivo");
        Calculadora instance = new Calculadora();
        instance.lectorArchivo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of realizaOperaciones method, of class Calculadora.
     */
    @Test
    public void testRealizaOperaciones() {
        System.out.println("realizaOperaciones");
        Calculadora instance = new Calculadora();
        instance.realizaOperaciones();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of operarElementos method, of class Calculadora.
     */
    @Test
    public void testOperarElementos() {
        System.out.println("operarElementos");
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.operarElementos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
