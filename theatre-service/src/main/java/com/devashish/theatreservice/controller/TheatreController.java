package com.devashish.theatreservice.controller;

import com.devashish.theatreservice.entity.Screening;
import com.devashish.theatreservice.service.TheatreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theatre")
@RequiredArgsConstructor
public class TheatreController {

    private final TheatreService theatreService;

    @GetMapping("/")
    public String baseReq() {
        return "Working - Theatre service";
    }

    @GetMapping("/screenings/{theatreID}/{movieName}")
    public Screening[] getScreenings(@PathVariable Long theatreID, @PathVariable String movieName) {
        return theatreService.getScreenings(theatreID, movieName);
    }
}
