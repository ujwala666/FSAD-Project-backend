package com.fsad.artgallery.config;

import com.fsad.artgallery.model.*;
import com.fsad.artgallery.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(ArtworkRepository artworkRepository,
                               ExhibitionRepository exhibitionRepository,
                               GalleryUserRepository galleryUserRepository,
                               NetworkContactRepository networkContactRepository,
                               AuthUserRepository authUserRepository) {
        return args -> {
            if (artworkRepository.count() == 0) {
                artworkRepository.save(new Artwork("The Starry Night", "Vincent van Gogh", 95000, 1889, "Post-Impressionism", "https://images.unsplash.com/photo-1541961017774-22349e4a1262?w=600", "One of the most recognized paintings in Western art."));
                artworkRepository.save(new Artwork("The Great Wave", "Hokusai", 45000, 1831, "Ukiyo-e", "https://images.unsplash.com/photo-1578301978693-85fa9c0320b9?w=600", "Famous woodblock print."));
                artworkRepository.save(new Artwork("Water Lilies", "Claude Monet", 78000, 1906, "Impressionism", "https://images.unsplash.com/photo-1579783902614-a3fb3927b6a5?w=600", "Part of Monet's series."));
                artworkRepository.save(new Artwork("Persistence of Memory", "Salvador Dalí", 120000, 1931, "Surrealism", "https://images.unsplash.com/photo-1547826039-bfc35e0f1ea8?w=600", "Melting clocks."));
            }

            if (exhibitionRepository.count() == 0) {
                exhibitionRepository.save(new Exhibition("Renaissance Masters", "Explore the genius of Leonardo, Michelangelo and Botticelli.", 45, 12450, "Active", "https://images.unsplash.com/photo-1578662996442-48f60103fc96?w=800", "Main Hall A", "Sophia Bennett", "April 1 - June 30"));
                exhibitionRepository.save(new Exhibition("Modern Abstractions", "A journey through abstract expressionism.", 32, 8720, "Active", "https://images.unsplash.com/photo-1541961017774-22349e4a1262?w=800", "Contemporary Wing", "Ethan Cole", "May 10 - August 12"));
            }

            if (galleryUserRepository.count() == 0) {
                galleryUserRepository.save(new GalleryUser("John Smith", "john@example.com", "Artist", "Active", "Jan 15, 2024"));
                galleryUserRepository.save(new GalleryUser("Emily Chen", "emily@example.com", "Collector", "Active", "Feb 3, 2024"));
            }

            if (networkContactRepository.count() == 0) {
                networkContactRepository.save(new NetworkContact("Olivia Carter", "Curator", "olivia@artgallery.com", "National Arts Board"));
                networkContactRepository.save(new NetworkContact("Liam Turner", "Collector", "liam@collectorshub.com", "Collectors Hub"));
            }

            if (!authUserRepository.existsByEmail("admin@artgallery.com")) {
                authUserRepository.save(new AuthUser("Admin User", "admin@artgallery.com", "admin123"));
            }
        };
    }
}
