package org.acme.configuration;

import io.quarkus.runtime.Startup;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.services.implementations.LabSeqServiceImpl;

@Startup
@ApplicationScoped
public class DataSeeder {
    @Inject
    LabSeqServiceImpl labSeqService;

    @PostConstruct
    public void seedData(){
        for (int i = 0; i <= 1000; i++) {
            labSeqService.getLabSeqValue(i);
        }
    }
}
