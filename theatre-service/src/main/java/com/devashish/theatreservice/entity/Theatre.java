package com.devashish.theatreservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "theatre")
@NoArgsConstructor
@AllArgsConstructor
public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "theatreID", nullable = false)
    private Long theatreID;

    @Column(name = "theatreName", nullable = false)
    private String theatreName;

    @Column(name = "city", nullable = false)
    private String city;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Screen> screens;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Screening> screenings;
}
