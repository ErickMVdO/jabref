package org.jabref.cli;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.mockito.Answers;

import org.jabref.preferences.JabRefPreferences;

public class ArgumentProcessorTest {
    private JabRefPreferences preferences;

    @BeforeEach
    public void setUp() throws Exception {
        preferences = mock(JabRefPreferences.class, Answers.RETURNS_DEEP_STUBS);
    }


    @Test // caso de teste 3
    void processingArgumentsForImportFileToDownloadThatDoesntExist() throws Exception {
        String[] arguments = new String[]{"-i=http://www.fum.com.br/"};
        ArgumentProcessor argumentProcessor = new ArgumentProcessor(arguments, ArgumentProcessor.Mode.INITIAL_START, preferences);
        assertFalse(argumentProcessor.hasParserResults());
    }

   /* @Test // caso de teste 1
    void processingArgumentsForImportFileToDownload() throws Exception {
        //JabRefCLI cli = new JabRefCLI(new String[]{"-i=https://www.scielo.br/j/abc/a/NWKkJDxLthWSb53XFV9Nhvn/?format=pdf&lang=pt,pdf"});
        //assertEquals(true, cli.isFileImport());
        String[] arguments = new String[]{"-i=https://www.scielo.br/j/abc/a/NWKkJDxLthWSb53XFV9Nhvn/?format=pdf&lang=pt,tmp"};
        ArgumentProcessor argumentProcessor = new ArgumentProcessor(arguments, ArgumentProcessor.Mode.INITIAL_START, preferences);
        assertFalse(argumentProcessor.hasParserResults());
    }*/

    @Test // caso de teste 4
    void processingArgumentsForImportFileToDownloadWithWrongTipe() throws Exception {
        //JabRefCLI cli = new JabRefCLI(new String[]{"-i=https://www.scielo.br/j/abc/a/NWKkJDxLthWSb53XFV9Nhvn/?format=pdf&lang=pt, pgf"});
        //assertFalse(cli.isFileImport());
        String[] arguments = new String[]{"-i=https://www.scielo.br/j/abc/a/NWKkJDxLthWSb53XFV9Nhvn/?format=pdf&lang=pt, pgf"};
        ArgumentProcessor argumentProcessor = new ArgumentProcessor(arguments, ArgumentProcessor.Mode.INITIAL_START, preferences);
        assertFalse(argumentProcessor.hasParserResults());
    }


}
