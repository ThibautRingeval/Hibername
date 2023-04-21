package com.classes;
import javax.persistence.*;

	@Entity
	@Table(name = "client")
	public class Client {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)

	    @Column(nullable = false)
	    private String nom;

	    @Column(nullable = false)
	    private String prenom;

	    @Column(nullable = false)
	    private String telephone;

	    public Client() {}

	    public Client(String nom, String prenom, String telephone) {
	        this.nom = nom;
	        this.prenom = prenom;
	        this.telephone = telephone;
	    }

	    // Getters and setters
	}
