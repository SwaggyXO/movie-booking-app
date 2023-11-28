package com.devashish.theatreservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Entity
@Data
@Table(name = "screening")
@NoArgsConstructor
@AllArgsConstructor
public class Screening {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "screeningID", nullable = false)
    private Long screeningID;

    @Column(name = "theatreID", nullable = false)
    private Long theatreID;

    @Column(name = "screenID", nullable = false)
    private Long screenID;

    @Column(name = "movieName", nullable = false)
    private String movieName;

    @Column(name = "screeningDate", nullable = false)
    private ZonedDateTime screeningDate;

    @Column(name = "bookedTickets", nullable = true)
    private Integer bookedTickets;
}
