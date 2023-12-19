package org.example.manager;

import org.example.films.ActionFilm;
import org.example.films.DetectiveFilm;
import org.example.films.Film;
import org.example.films.HorrorFilm;
import org.example.films.abstractfactory.FilmAbstractFactory;
import org.example.films.factory.ActionFilmFactory;
import org.example.films.factory.DetectiveFilmFactory;
import org.example.films.factory.HorrorFilmFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;

public class FilmManager {
    private static FilmManager instance;
    private List<Film> films;

    public FilmManager() {
        films = new ArrayList<>();
        loadFilmFromXML("films.xml");
    }

    public static FilmManager getInstance() {
        if (instance == null) {
            instance = new FilmManager();
        }
        return instance;
    }

    public void loadFilmFromXML(String filePath) {
//

        try {
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = documentFactory.newDocumentBuilder();

            Document document = ((DocumentBuilder) builder).parse(filePath);

            NodeList filmList = document.getElementsByTagName("film");

            for (int i = 0; i < filmList.getLength(); i++) {
                Element filmElement = (Element) filmList.item(i);

                String name = filmElement.getElementsByTagName("name").item(0).getTextContent();
                String genre = filmElement.getElementsByTagName("genre").item(0).getTextContent();
                String rating = filmElement.getElementsByTagName("rating").item(0).getTextContent();
                String release = filmElement.getElementsByTagName("release").item(0).getTextContent();

                FilmAbstractFactory filmFactory;

                switch (genre.toLowerCase()) {
                    case "detective" -> filmFactory = new DetectiveFilmFactory();
                    case "action" -> filmFactory = new ActionFilmFactory();
                    case "horror" -> filmFactory = new HorrorFilmFactory();
                    default -> {
                        System.err.println("Ошибка в xml файле");
                        return;
                    }
                }

                films.add(filmFactory.createFilm(name, rating, release));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int printDetectiveFilms() {
        int DetectiveFilmCount = 0;
        for (Film film : films) {
            if (film.getClass() == DetectiveFilm.class) {
                System.out.println(film);
                DetectiveFilmCount++;
            }
        }
        return DetectiveFilmCount;

    }

    public int printActionFilms() {
    int ActionFilmCount = 0;
        for (Film film : films) {
            if (film.getClass() == ActionFilm.class) {
                System.out.println(film);
                ActionFilmCount++;
            }
        }
        return ActionFilmCount;
    }

    public int printHorrorFilms() {
        int HorrorFilmCount = 0;
        for (Film film : films) {
            if (film.getClass() == HorrorFilm.class) {
                System.out.println(film);
                HorrorFilmCount++;
            }
        }

        return HorrorFilmCount;
    }

    public void printStatistics() {
        System.out.println("\nКоличество фильмов: " + films.size());
        System.out.println("Детективы: " + DetectiveFilm.getInstanceCount());
        System.out.println("Экшен: " + ActionFilm.getInstanceCount());
        System.out.println("Ужастики: " + HorrorFilm.getInstanceCount());

        double averageRating = films.stream()
                .mapToDouble(film -> parseRating(film.getRating()))
                .average()
                .orElse(0.0);

        System.out.printf("Средняя оценка всех фильмов: %.2f\n", averageRating);

    }

    private double parseRating(String rating) {
        String Rating = rating.substring(0, rating.length() - 3);

        try {
            return Double.parseDouble(Rating);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return 0.0;
        }
    }
}

