package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.example.films.Film;
import org.example.manager.FilmManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.Scanner;


@Controller
public class Main {
    @GetMapping("/home")
    public String home(Model model) {

        FilmManager filmManager = FilmManager.getInstance();
        model.addAttribute("detectiveList", filmManager.printDetectiveFilms());
        model.addAttribute("actionList", filmManager.printActionFilms());
        model.addAttribute("horrorList", filmManager.printHorrorFilms());
        return "home";
    }
}