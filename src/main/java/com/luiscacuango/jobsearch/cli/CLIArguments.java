package com.luiscacuango.jobsearch.cli;

import com.beust.jcommander.Parameter;

public class CLIArguments {
    CLIArguments() {

    }

    @Parameter(
            required = true,
            descriptionKey = "KEYWORD",
            validateWith = CLIKeywordValidator.class,
            description = "KEYWORD"
    )

    private String keyword;
    @Parameter(
            names = {"-l", "--location"},
            description = "Cada busqueda puede incluir una ubicacion"
    )
    private String location;
    @Parameter(
            names = {"-p", "--page"},
            description = "La API devuelve 50 resultados, usa un numero para la pagina"
    )
    private int page = 0;
    @Parameter(
            names = {"--full-time"},
            description = "Agregar si queremos trabajos de tiempo completo"
    )
    private boolean isFullTime = false;
    @Parameter(
            names = "--markdown",
            description = "Obtener los resultados en mardown"
    )
    private boolean isMarkdown = false;
    @Parameter(
            names = "--help",
            help = true,
            validateWith = CLIHelpValidator.class,
            description = "Muestrar esta ayuda"
    )
    private boolean isHelp;

    public String getKeyword() {
        return keyword;
    }

    public String getLocation() {
        return location;
    }

    public int getPage() {
        return page;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public boolean isMarkdown() {
        return isMarkdown;
    }

    public boolean isHelp() {
        return isHelp;
    }

    @Override
    public String toString() {
        return "CLIArguments{" +
                "keyword='" + keyword + '\'' +
                ", location='" + location + '\'' +
                ", page=" + page +
                ", isFullTime=" + isFullTime +
                ", isMarkdown=" + isMarkdown +
                ", isHelp=" + isHelp +
                '}';
    }

    public static CLIArguments newInstance() {
        return new CLIArguments();
    }

}
