package com.codecool.line;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {
    private Line line;
    private Line line1;
    private Line line2;
    private Line line3;
    private Line line4;
    
    @BeforeEach
    void setUp() {
        line = new Line(0.0, 0.0, 1.0, 3.0);
        line1 = new Line(0.0, 0.0, 0.0, 3.0);
        line2 = new Line(0.0, 12.0, 1.0, 3.0);
        line3 = new Line(0.0, 0.0, 3.0, 4.0);
        line4 = new Line(2.0, 2.0, 3.0, 5.0);
        
    }
    
    @Test
    void testGetSlope() {
        assertEquals(3.0, line.getSlope(), 0.0001);
    }
    
    @Test
    void testGetSlopeException() {
        assertThrows(ArithmeticException.class, () -> {
            line1.getSlope();
        });
    }
    
    @Test
    void testGetDistance() {
        assertEquals(5.0, line3.getDistance(), 0.0001);
    }
    
    @Test
    void testParallelTo() {
        assertFalse(line.parallelTo(line2));
        assertTrue(line.parallelTo(line4));
    }
}
