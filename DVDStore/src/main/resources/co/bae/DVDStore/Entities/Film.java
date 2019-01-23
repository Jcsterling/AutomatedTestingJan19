package com.bae.DVDStore.Entities;

import javax.persistence.GenerationType;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Film {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY);
	private Long id;
	
	private String title;
	
	private String description;
	
	private String category;
	
	private double price;
	
	private double length;
	
	private String rating;
	
	private String actors; 
	
	
	
	
	
	

}
