package com.devashish.movieservice.service;

import com.devashish.movieservice.dto.ScreenDTO;
import com.devashish.movieservice.dto.ScreeningsDTO;
import com.devashish.movieservice.dto.TheatreDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final WebClient.Builder webClient;

    public ScreeningsDTO[] getMovieScreenings(Long theatreID, String movieName) {
        return webClient.build().get()
                .uri("http://theatre-service/screenings/{theatreID}/{movieName}", theatreID, movieName)
                .retrieve()
                .bodyToMono(ScreeningsDTO[].class)
                .block();
    }
}
