package org.acme.service.interfaces;

/**
 * Service interface for calculating Labseq values.
 */
public interface LabSeqService {

    /**
     * Calculates the Labseq value for a given input 'n'.
     *
     * @param n The input value for which the Labseq value needs to be calculated.
     * @return The Labseq value for the given input 'n'.
     * @throws IllegalArgumentException If the input value is null or negative. This exception is handled internally.
     */
    int getLabSeqValue(Integer n);
}
