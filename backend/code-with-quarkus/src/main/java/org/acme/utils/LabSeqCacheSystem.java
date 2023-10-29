package org.acme.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * The class contains methods to calculate Labseq values based on the rules of
 * the Labseq sequence. It uses a cache to store previously calculated values.
 */
public class LabSeqCacheSystem {

    private static final Map<Integer, Integer> cache = new HashMap<>();
    private static final int LAB_SEQ_ZERO_VALUE = 0;
    private static final int LAB_SEQ_ONE_VALUE = 1;
    private static final String ERROR_MESSAGE_NON_NEGATIVE_INTEGER = "n should be a non-negative integer";

    /**
     * Calculates the Labseq value for a given input 'n'.
     *
     * @param n The input value for which the labseq value needs to be calculated.
     * @return The labseq value for the given input 'n'.
     * @throws IllegalArgumentException If the input value is null or negative.
     */
    public static int getLabSeqValue(Integer n) {
        if (n == null || n < 0) {
            throw new IllegalArgumentException(ERROR_MESSAGE_NON_NEGATIVE_INTEGER);
        }

        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        int result;
        if (n < 4) {
            result = (n == 0 || n == 2) ? LAB_SEQ_ZERO_VALUE : LAB_SEQ_ONE_VALUE;
        } else {
            int valueWith4 = getLabSeqValue(n - 4);
            int valueWith3 = getLabSeqValue(n - 3);
            result = valueWith4 + valueWith3;
        }

        cache.put(n, result);
        return result;
    }
}
