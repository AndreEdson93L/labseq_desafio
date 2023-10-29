package org.acme.service.interfaces;

/**
 * Service interface for calculating Labseq values.
 */
public interface LabSeqService {

    /**
     * Calculates the LabSeq value for a given input 'n'.
     *
     * @param n The input value for which the LabSeq value needs to be calculated.
     * @return The LabSeq value for the given input 'n'.
     * @throws IllegalArgumentException If the input value is null or negative. This exception is handled internally.
     */
    int getLabSeqValue(Integer n);
}
