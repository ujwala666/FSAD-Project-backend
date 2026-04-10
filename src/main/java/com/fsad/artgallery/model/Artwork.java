package com.fsad.artgallery.model;

import jakarta.persistence.*;

@Entity
public class Artwork {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String artist;
    private double price;
    private int yearValue;
    private String category;
    private String image;
    @Column(length = 1000)
    private String description;

    public Artwork() {}

    public Artwork(String title, String artist, double price, int yearValue, String category, String image, String description) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.yearValue = yearValue;
        this.category = category;
        this.image = image;
        this.description = description;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getArtist() { return artist; }
    public void setArtist(String artist) { this.artist = artist; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getYearValue() { return yearValue; }
    public void setYearValue(int yearValue) { this.yearValue = yearValue; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
