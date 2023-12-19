import org.example.manager.FilmManager;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ParsingTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private static FilmManager xmlParser;

    @Before
    public void setUp() {
        xmlParser = new FilmManager();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testPrintDetectiveFilms() {
        xmlParser.printDetectiveFilms();
        System.setOut(new PrintStream(outputStream));
    }
    @Test
    public void testPrintActionFilms() {
        xmlParser.printActionFilms();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testPrintHorrorFilms() {
        xmlParser.printHorrorFilms();
        System.setOut(new PrintStream(outputStream));
    }




}
