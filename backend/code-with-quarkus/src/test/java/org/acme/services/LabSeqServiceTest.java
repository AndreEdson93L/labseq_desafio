package org.acme.services;

import org.acme.services.implementations.LabSeqServiceImpl;
import org.acme.services.interfaces.LabSeqService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for LabSeqService.
 */
public class LabSeqServiceTest {

    /**
     * Tests LabSeqService calculations for various input values.
     * The LabSeq sequence calculations are as follows:
     * n=0 => l(0) = 0
     * n=1 => l(1) = 1
     * n=2 => l(2) = 0
     * n=3 => l(3) = 1
     * n>3 => l(n) = l(n-4) + l(n-3)
     */
    @Test
    public void testLabSeqCalculation() {
        LabSeqService labSeqService = new LabSeqServiceImpl();

        assertEquals(0, labSeqService.getLabSeqValue(0));
        assertEquals(1, labSeqService.getLabSeqValue(1));
        assertEquals(0, labSeqService.getLabSeqValue(2));
        assertEquals(1, labSeqService.getLabSeqValue(3));
        assertEquals(1, labSeqService.getLabSeqValue(4));
        assertEquals(2, labSeqService.getLabSeqValue(9));
        // The following value is calculated based on the provided logic
        assertEquals(-2075039253, labSeqService.getLabSeqValue(988));
    }
}
