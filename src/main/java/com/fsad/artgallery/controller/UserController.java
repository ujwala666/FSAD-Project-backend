package com.fsad.artgallery.controller;

import com.fsad.artgallery.model.GalleryUser;
import com.fsad.artgallery.repository.GalleryUserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {
    private final GalleryUserRepository galleryUserRepository;

    public UserController(GalleryUserRepository galleryUserRepository) {
        this.galleryUserRepository = galleryUserRepository;
    }

    @GetMapping
    public List<GalleryUser> getAll() {
        return galleryUserRepository.findAll();
    }

    @PostMapping
    public GalleryUser add(@RequestBody GalleryUser user) {
        return galleryUserRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!galleryUserRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        galleryUserRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
