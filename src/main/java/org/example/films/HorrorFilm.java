package org.example.films;

public class HorrorFilm extends Film {
    private static int instanceCount = 0;
    public HorrorFilm(String name, String rating, String releaseDate) {
        super(name, rating, releaseDate);
        genre = "Ужастик";
        instanceCount++;
    }

    public HorrorFilm() {

    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    @Override
    public String getDescription() {
        return "\n\tЖанр ужасы в фильмах создаёт атмосферу страха и неизвестности,\n" +
                " погружая зрителя в зловещие и пугающие окружения";
    }

    @Override
    public String toString() {
        return "\n\nУжастик:\n" +
                "Название: " + getName() + "\n" +
                "Жанр: " + getGenre() + "\n" +
                "Рейтинг: " + getRating() + "\n" +
                "Дата выхода: " + getReleaseDate();
    }
}
