package com.luiscacuango.jobsearch.api;

import feign.Headers;
import feign.QueryMap;
import feign.RequestLine;

import java.util.Map;

@Headers("Accept: application/json")
public interface APIJobs {

    // Cambiamos la ruta al endpoint de la nueva API
    @RequestLine("GET /api/job-board-api")
    // en lugar de una lista directa (List<JobPosition>)
    APIResponse jobs(@QueryMap Map<String, Object> query);

}
