package com.example.ex01_transportadora_abc;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainActivityTest {

    @Test
    public void testCaseA() { assertEquals(2255.63, MainActivity.calcularCusto(56.22, 182.37), 0.01);
    }
    @Test
    public void testCaseB() { assertEquals(8.8, MainActivity.calcularCusto(2,20), 0.0001);
    }
    @Test
    public void testCaseC() { assertEquals(3168, MainActivity.calcularCusto(600,24), 0.0001);
    }
    @Test
    public void testCaseD() { assertEquals(110, MainActivity.calcularCusto(5,100), 0.0001);
    }
}