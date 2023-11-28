package com.devashish.theatreservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "screen")
@NoArgsConstructor
@AllArgsConstructor
public class Screen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "screenID", nullable = false)
    private Long screenID;

    @Column(name = "theatreID", nullable = false)
    private Long theatreID;

    @Column(name = "seats", nullable = false)
    private Integer seats;
}
