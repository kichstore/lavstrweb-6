package org.example.films;

public abstract class Film {
    protected String name;
    protected String genre;
    protected String rating;
    protected String releaseDate;

    public Film(String name, String rating, String releaseDate) {
        this.name = name;
        this.rating = rating;
        this.releaseDate = releaseDate;
    }

    public Film() {
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getRating() {
        return rating;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public abstract String getDescription();
}
