package com.devashish.movieservice.repository;

import com.devashish.movieservice.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    Movie findByMovieID(Long movieID);
    Movie findByMovieName(String movieName);
}
