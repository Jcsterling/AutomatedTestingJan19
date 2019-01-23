package com.bae.DVDStore.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.DVDStore.Entities.Film;
import com.bae.DVDStore.Repository.FilmRepository;




@Service
public class FilmService {
	
	
	@Autowired
	private FilmRepository frepo;
	
	 
	 public List<Film> getAllFilms(){
		 
		return frepo.findAll();
	 }
	 
	 public void addFilm (Film film) {
		 frepo.save(film);
	 }
	  
	 public void updateFilm(Long id, Film film) {
		 
		 }
	  
	 public Optional<Film> getFilm(Long Id) {
	        return frepo.findById(Id);
	
	 }

}
