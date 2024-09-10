/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author richa
 */
public class EstadiaTest {

    @Test
    public void testaValorPagarDiaSeguinte() {
        Estadia estadia = new Estadia(20, 2);
        
        assertEquals(estadia.calcularValorPagar(), 18, 0);
    }
    
}
