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
}