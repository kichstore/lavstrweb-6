
import org.example.manager.FilmManager;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class StatisticTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private static FilmManager xmlParser;

    @Before
    public void setUp() {
        xmlParser = new FilmManager();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testStatistic() {
        xmlParser.printStatistics();
        String output = outputStream.toString();
    }
}