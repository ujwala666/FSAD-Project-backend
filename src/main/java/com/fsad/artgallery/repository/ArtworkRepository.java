package com.fsad.artgallery.repository;

import com.fsad.artgallery.model.Artwork;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtworkRepository extends JpaRepository<Artwork, Long> {
}
