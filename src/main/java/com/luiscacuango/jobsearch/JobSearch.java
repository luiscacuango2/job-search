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

        Optional<CLIArguments> cliArgumentsOptional =
                parseArguments(jCommander, args, JCommander::usage)
                        .orElse(Collections.emptyList())
                        .stream()
                        .map(obj -> (CLIArguments) obj)
                        .filter(cli -> !cli.isHelp())
                        .filter(cli -> cli.getKeyword() != null)
                        .findFirst();

        // Pasamos el objeto CLIArguments completo para tener acceso a los filtros
        cliArgumentsOptional
                .map(cli -> executeRequest(cli)) // Cambio aquí
                .orElse(Stream.empty())
                .forEach(System.out::println);
    }
    private static Stream<JobPosition> executeRequest(CLIArguments cliArguments) {
        APIJobs api = buildAPI(APIJobs.class, "https://www.arbeitnow.com");

        try {
            // 1. Convertimos los argumentos a Mapa para la Query de la API
            Map<String, Object> params = CLIFunctions.toMap(cliArguments);

            // 2. Consumimos la API
            APIResponse response = api.jobs(params);

            // 3. FILTRO FUNCIONAL: Aquí es donde ocurre la magia
            return response.getData().stream()
                    .filter(job -> {
                        // Si no hay ubicación en el CLI, pasan todos
                        if (cliArguments.getLocation() == null || cliArguments.getLocation().isEmpty()) {
                            return true;
                        }
                        // Validamos que la ubicación del trabajo contenga la del argumento
                        return job.getLocation().toLowerCase()
                                .contains(cliArguments.getLocation().toLowerCase());
                    });

        } catch (Exception e) {
            System.err.println("Error de conexión: " + e.getMessage());
            return Stream.empty();
        }
    }
}
