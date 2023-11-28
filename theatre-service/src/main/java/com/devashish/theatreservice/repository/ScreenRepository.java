package com.devashish.theatreservice.repository;

import com.devashish.theatreservice.entity.Screen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScreenRepository extends JpaRepository<Screen, Long> {

    Screen findByScreenID(Long screenID);

    List<Screen> findByTheatreID(Long theatreID);
}
