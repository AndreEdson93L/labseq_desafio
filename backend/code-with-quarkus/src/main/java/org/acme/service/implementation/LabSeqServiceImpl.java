package org.acme.service.implementation;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.service.interfaces.LabSeqService;
import org.acme.utils.LabSeqCacheSystem;

/**
 * Implementation of LabSeqService interface.
 */
@ApplicationScoped
public class LabSeqServiceImpl implements LabSeqService {

    /**
     * Calculates the LabSeq value for a given input 'n'.
     *
     * @param n The input value for which the LabSeq value needs to be calculated.
     * @return The LabSeq value for the given input 'n'.
     * @throws IllegalArgumentException If the input value is null or negative. This exception is handled internally.
     */
    @Override
    public int getLabSeqValue(Integer n) {
        return LabSeqCacheSystem.getLabSeqValue(n);
    }
}
