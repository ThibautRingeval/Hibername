package com.classes;
import javax.persistence.*;

	@Entity
	@Table(name = "product")
	public class Product {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)

	    @Column(nullable = false)
	    private String Produit;

	    @Column(nullable = false)
	    private int prix;

	    public Product() {}

	    public Product(String Produit, int prix) {
	        this.Produit = Produit;
	        this.prix = prix;
	    }

	    // Getters and setters
	}