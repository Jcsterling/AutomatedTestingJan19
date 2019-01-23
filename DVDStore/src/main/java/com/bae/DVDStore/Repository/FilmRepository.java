package com.bae.DVDStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.DVDStore.Entities.Film;


@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {

}
