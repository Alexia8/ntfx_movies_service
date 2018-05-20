package com.alexiacdura.ntfxmoviesservice.controller;

import com.alexiacdura.ntfxmoviesservice.model.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.alexiacdura.ntfxmoviesservice.repository.MoviesRepository;

import java.util.List;
import java.util.Optional;
/**
 * Created by alexiacdura 13/05/2018
 *
 * @author Alexia C. Durá
 */

/**
 * Identify class as a rest controller
 */
@RestController
/**
 * Establish base route for rest endpoint
 */
@RequestMapping(value = "/movies")
public class MoviesController {

    /**
     * Identify repository interface JPA binds with
     */
    @Autowired
    MoviesRepository moviesRepository;

    /**
     * Return method that returns all movies in DB
     *
     * @return List<Movies> list of movies
     */
    @GetMapping(value = "/all")
    public List<Movies> getAllMovies() {
        return moviesRepository.findAll();
    }

    /**
     * Return method that returns a specific movie from db
     *
     * @param id unique id received
     * @return Movies single object
     */
    @GetMapping(value = "/{id}")
    public Optional<Movies> getMovie(@PathVariable("id") final Integer id) {
        return moviesRepository.findById(id);
    }

    /**
     * Void method that adds a movie to DB
     *
     * @param movies object received
     * @return List<Movies> list of movies after adding
     */
    @PostMapping(value = "/add")
    public List<Movies> addMovie(@RequestBody final Movies movies) {
        moviesRepository.save(movies);
        return moviesRepository.findAll();
    }

}
