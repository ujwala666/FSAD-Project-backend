package com.fsad.artgallery.model;

import jakarta.persistence.*;

@Entity
public class Exhibition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(length = 1000)
    private String description;
    private int artworks;
    private int visitors;
    private String status;
    private String image;
    private String venue;
    private String curator;
    private String duration;

    public Exhibition() {}

    public Exhibition(String title, String description, int artworks, int visitors, String status, String image, String venue, String curator, String duration) {
        this.title = title;
        this.description = description;
        this.artworks = artworks;
        this.visitors = visitors;
        this.status = status;
        this.image = image;
        this.venue = venue;
        this.curator = curator;
        this.duration = duration;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public int getArtworks() { return artworks; }
    public void setArtworks(int artworks) { this.artworks = artworks; }
    public int getVisitors() { return visitors; }
    public void setVisitors(int visitors) { this.visitors = visitors; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }
    public String getVenue() { return venue; }
    public void setVenue(String venue) { this.venue = venue; }
    public String getCurator() { return curator; }
    public void setCurator(String curator) { this.curator = curator; }
    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }
}
