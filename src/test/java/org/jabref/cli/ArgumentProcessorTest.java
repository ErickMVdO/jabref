package org.jabref.cli;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

<<<<<<< HEAD
=======
import static org.junit.jupiter.api.Assertions.*;
>>>>>>> 50bb1eebcdd5cc7839104ac02d0ca5c8371c920e
import static org.mockito.Mockito.mock;

import org.mockito.Answers;

import org.jabref.preferences.JabRefPreferences;

<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

=======
>>>>>>> 50bb1eebcdd5cc7839104ac02d0ca5c8371c920e
public class ArgumentProcessorTest {
    private JabRefPreferences preferences;

    @BeforeEach
    public void setUp() throws Exception {
        preferences = mock(JabRefPreferences.class, Answers.RETURNS_DEEP_STUBS);
    }

<<<<<<< HEAD
    @Test
    void processingArgumentsForImportFileToDownload() throws Exception {
        String[] arguments = new String[]{"--nogui", "--import=https://raw.githubusercontent.com/barbagroup/bibtex/master/barba.bib"};
        JabRefCLI cli = new JabRefCLI(arguments);
        ArgumentProcessor argumentProcessor = new ArgumentProcessor(arguments, ArgumentProcessor.Mode.REMOTE_START, preferences);
        assertTrue(argumentProcessor.hasParserResults());
    }

    @Test
    void processingArgumentsForImportFileToDownloadThatDoesntExist() throws Exception {
        String[] arguments = new String[]{"-i=http://www.fum.com.br/"};
        ArgumentProcessor argumentProcessor = new ArgumentProcessor(arguments, ArgumentProcessor.Mode.REMOTE_START, preferences);
        assertFalse(argumentProcessor.hasParserResults());

    }
}
=======

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
>>>>>>> 50bb1eebcdd5cc7839104ac02d0ca5c8371c920e
