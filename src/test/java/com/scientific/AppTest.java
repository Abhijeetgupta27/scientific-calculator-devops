package com.scientific;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testAddition() {
        assertEquals(5, App.add(2,3));
    }

    @Test
    void testSubtraction() {
        assertEquals(3, App.subtract(5,2));
    }

    @Test
    void testMultiplication() {
        assertEquals(10, App.multiply(5,2));
    }

    @Test
    void testDivision() {
        assertEquals(2, App.divide(4,2));
    }

    @Test
    void testSquareRoot() {
        assertEquals(4, App.squareRoot(16));
    }

    @Test
    void testPower() {
        assertEquals(8, App.power(2,3));
    }
}