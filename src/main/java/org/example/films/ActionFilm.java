package org.example.films;

public class ActionFilm extends Film{
    private static int instanceCount = 0;

    public ActionFilm(String name, String rating, String releaseDate) {
        super(name, rating, releaseDate);
        genre = "Экшен";
        instanceCount++;
    }

    public ActionFilm() {
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    @Override
    public String getDescription() {
        return "\n\tЭто фильмы, где акцент делается на стрельбе, \n" +
                "экшене и на большом количестве движений пероснажа.";
    }

    @Override
    public String toString() {
        return "\n\nЭкшен фильм:\n" +
                "Название: " + getName() + "\n" +
                "Жанр: " + getGenre() + "\n" +
                "Рейтинг: " + getRating() + "\n" +
                "Дата выхода: " + getReleaseDate();
    }
}
