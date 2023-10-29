package org.acme.configuration;

import org.acme.utils.LabSeqCacheSystem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for the DataLoader functionality
 */
public class DataSeederTest {

    @Test
    public void testDataLoader(){
        // Step 1: Ensure LabSeq(90) && LabSeq(56) are cached
        LabSeqCacheSystem.getLabSeqValue(90);
        LabSeqCacheSystem.getLabSeqValue(56);

        // Step 2: Retrieve LabSeq(90) from the cache and assert its value
        int first_cachedValue = LabSeqCacheSystem.getLabSeqValue(90);
        int second_cachedValue = LabSeqCacheSystem.getLabSeqValue(56);

        // Step 3: Assert that LabSeq(90) && LabSeq(56 )match the correct results.
        assertEquals(24815508, first_cachedValue);
        assertEquals(28158, second_cachedValue);
    }
}
