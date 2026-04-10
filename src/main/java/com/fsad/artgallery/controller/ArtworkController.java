package com.fsad.artgallery.controller;

import com.fsad.artgallery.model.Artwork;
import com.fsad.artgallery.repository.ArtworkRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artworks")
@CrossOrigin(origins = "*")
public class ArtworkController {
    private final ArtworkRepository artworkRepository;

    public ArtworkController(ArtworkRepository artworkRepository) {
        this.artworkRepository = artworkRepository;
    }

    @GetMapping
    public List<Artwork> getAll() {
        return artworkRepository.findAll();
    }

    @PostMapping
    public Artwork add(@RequestBody Artwork artwork) {
        return artworkRepository.save(artwork);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!artworkRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        artworkRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
