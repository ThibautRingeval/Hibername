package com.classes;
import javax.persistence.*;

	@Entity
	@Table(name = "command")
	public class Command {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)

	    @Column(nullable = false)
	    private String date;

	    @Column(nullable = false)
	    private String heure;

	    @Column(nullable = false)
	    private String article;
	    
	    @Column(nullable = false)
	    private String client;

	    public Command() {}

	    public Command(String date, String heure, String article, String client) {
	        this.date = date;
	        this.heure = heure;
	        this.article = article;
	        this.client = client;
	    }

	    // Getters and setters
	}
