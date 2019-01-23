package com.bae.DVDStore.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.DVDStore.Entities.Film;
import com.bae.DVDStore.Repository.FilmRepository;
import com.bae.DVDStore.Service.FilmService;



@RestController
public class FilmController {

	@Autowired
	private FilmService fService;
	
	@Autowired
	private FilmRepository fRepo;
	
	
	
	@GetMapping("/")
	public String hello() {
		return "home";
		
	}
	
	@GetMapping("/Film")
	public List<Film> getAllFilms() {
		return fService.getAllFilms();
	}
	
}
