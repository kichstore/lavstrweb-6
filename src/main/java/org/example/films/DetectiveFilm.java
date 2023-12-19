package org.example.films;

public class DetectiveFilm extends Film {
    private static int instanceCount = 0;
    public DetectiveFilm(String name, String rating, String releaseDate) {
        super(name, rating, releaseDate);
        genre = "Детектив";
        instanceCount++;
    }

    public DetectiveFilm() {

    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    @Override
    public String getDescription() {
        return "\n\tЭто фильмы которые заставляют подумать, \n" +
                "с неожиданными сюжетными поворотами.";
    }

    @Override
    public String toString() {
        return "\n\nФильм детектив:\n" +
                "Название: " + getName() + "\n" +
                "Жанр: " + getGenre() + "\n" +
                "Рейтинг: " + getRating() + "\n" +
                "Дата выхода: " + getReleaseDate();
    }
}
