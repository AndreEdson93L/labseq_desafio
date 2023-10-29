package org.acme.utils;

import org.acme.services.exceptions.InvalidArgumentException;

import java.util.HashMap;
import java.util.Map;

import static org.acme.utils.Literals.*;

/**
 * The class contains methods to calculate LabSeq values based on the rules of
 * the LabSeq sequence uses a cache to store previously calculated values.
 */
public class LabSeqCacheSystem {

    private static final Map<Integer, Integer> cache = new HashMap<>();


    /**
     * Calculates the LabSeq value for a given input 'n'.
     *
     * @param n The input value for which the labSeq value needs to be calculated.
     * @return The labSeq value for the given input 'n'.
     * @throws InvalidArgumentException If the input value is null or negative.
     */
    public static int getLabSeqValue(Integer n) {
        if (n == null || n < 0) {
            throw new InvalidArgumentException(ERROR_MESSAGE_NON_NEGATIVE_INTEGER);
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
