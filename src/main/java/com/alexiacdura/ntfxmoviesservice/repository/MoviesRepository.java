package com.alexiacdura.ntfxmoviesservice.repository;

import com.alexiacdura.ntfxmoviesservice.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created by alexiacdura 13/05/2018
 *
 * @author Alexia C. Durá
 */

/**
 * Interface that extends JPA repository and binds Model class
 */
public interface MoviesRepository extends JpaRepository<Movies, Integer> {


}
