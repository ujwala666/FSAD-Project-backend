package com.fsad.artgallery.repository;

import com.fsad.artgallery.model.Exhibition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExhibitionRepository extends JpaRepository<Exhibition, Long> {
}
