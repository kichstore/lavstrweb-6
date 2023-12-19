import org.example.films.DetectiveFilm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClassesObjectsTest {

    @Test
    void equalsObjects() {
        DetectiveFilm films1 = new DetectiveFilm("name", "rating", "releaseDate");
        String selfWritedTitle = "name";
        String title1 = films1.getName();
        assertEquals(title1, selfWritedTitle);

    }

}