package com.devashish.movieservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Entity
@Table(name = "movie")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movieID", nullable = false, unique = true)
    private Long movieID;

    @Column(name = "movieName", nullable = false)
    private String movieName;

    @Column(name = "releaseDate", nullable = false)
    private ZonedDateTime releaseDate;

    @Column(name = "rating")
    private Integer rating;

    @Column(name = "posterUrl")
    private String posterUrl;

    @Override
    public String toString() {
        return "Movie{" +
                "movieID=" + movieID +
                ", movieName=" + movieName +
                ", releaseDate=" + releaseDate +
                ", rating="+ (!rating.toString().isEmpty() ? rating : "NA") +
                ", posterUrl="+ (!posterUrl.isEmpty() ? posterUrl : "NA");
    };

}
