package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {

    @Test
     public void testAdd(){

        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    public void testMultiply(){

        Calculator calculator = new Calculator();
        assertEquals(4, calculator.multiply(2, 2));
    }
    @Test
    public void testDivision(){

        Calculator calculator = new Calculator();
        assertEquals(1.0, calculator.division(2, 2));
    }
}