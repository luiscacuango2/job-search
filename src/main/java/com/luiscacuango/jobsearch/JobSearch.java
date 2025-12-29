package com.luiscacuango.jobsearch;

import com.beust.jcommander.JCommander;
import com.luiscacuango.jobsearch.api.APIJobs;
import com.luiscacuango.jobsearch.api.APIResponse;
import com.luiscacuango.jobsearch.cli.CLIArguments;
import com.luiscacuango.jobsearch.cli.CLIFunctions;

import java.util.*;
import java.util.stream.Stream;

import static com.luiscacuango.jobsearch.CommanderFunctions.buildCommanderWithName;
import static com.luiscacuango.jobsearch.CommanderFunctions.parseArguments;
import static com.luiscacuango.jobsearch.api.APIFunctions.buildAPI;

public class JobSearch {
    public static void main(String[] args) {
        JCommander jCommander = buildCommanderWithName("job-search", CLIArguments::newInstance);

        Stream<CLIArguments> streamOfCLI =
                parseArguments(jCommander, args, JCommander::usage)
                        .orElse(Collections.emptyList())
                        .stream()
                        .map(obj -> (CLIArguments) obj);
        Optional<CLIArguments> cliArgumentsOptional =
                streamOfCLI.filter(cli -> !cli.isHelp())
                        .filter(cli -> cli.getKeyword() != null)
                        .findFirst();

        cliArgumentsOptional.map(CLIFunctions::toMap)
                .map(JobSearch::executeRequest)
                .orElse(Stream.empty())
                .forEach(System.out::println);
    }
    private static Stream<JobPosition> executeRequest(Map<String, Object> params) {
        APIJobs api = buildAPI(APIJobs.class, "https://www.arbeitnow.com");

        try {
            // Llamamos a la API y obtenemos el objeto de respuesta
            APIResponse response = api.jobs(params);

            // Retornamos el stream de la lista contenida en "data"
            return response.getData().stream();
        } catch (Exception e) {
            System.err.println("Error de conexión: API no disponible o parámetros incorrectos.");
            return Stream.empty();
        }
    }
}
