package org.acme.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import org.acme.services.implementations.LabSeqServiceImpl;

@Path("/lab-seq")
public class LabSeqController {

    @Inject
    LabSeqServiceImpl labSeqService;

    @GET
    public int calculateLabSeq(@QueryParam("n") Integer n){
        return labSeqService.getLabSeqValue(n);
    }
}
