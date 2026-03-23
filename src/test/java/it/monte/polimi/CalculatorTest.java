package it.monte.polimi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator c = new Calculator();

    @Test
    void add() {
        assertEquals(3, c.add(1, 2));
        assertEquals(0, c.add(0,0));
    }

    @Test
    void sub() {
        assertEquals(-1, c.sub(1, 2));
        assertEquals(0, c.sub(0, 0));
    }

    @Test
    void mul(){
        assertEquals(6, c.mul(2,3));
        assertEquals(0, c.mul(2,0));
    }
}