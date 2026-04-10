package com.fsad.artgallery.repository;

import com.fsad.artgallery.model.GalleryUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GalleryUserRepository extends JpaRepository<GalleryUser, Long> {
}
