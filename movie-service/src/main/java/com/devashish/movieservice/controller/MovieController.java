package com.devashish.movieservice.controller;

import com.devashish.movieservice.dto.ScreeningsDTO;
import com.devashish.movieservice.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping("/base")
    public String baseReq() {
        return "Working fine - Movie";
    }

    @GetMapping("/{theatreID}/{movieName}/screenings")
    public ScreeningsDTO[] getMovieScreenings(@PathVariable Long theatreID, @PathVariable String movieName) {
        return movieService.getMovieScreenings(theatreID, movieName);
    }
}
