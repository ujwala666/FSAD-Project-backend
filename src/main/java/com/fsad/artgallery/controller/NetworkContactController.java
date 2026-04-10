package com.fsad.artgallery.controller;

import com.fsad.artgallery.model.NetworkContact;
import com.fsad.artgallery.repository.NetworkContactRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/network")
@CrossOrigin(origins = "*")
public class NetworkContactController {
    private final NetworkContactRepository networkContactRepository;

    public NetworkContactController(NetworkContactRepository networkContactRepository) {
        this.networkContactRepository = networkContactRepository;
    }

    @GetMapping
    public List<NetworkContact> getAll() {
        return networkContactRepository.findAll();
    }

    @PostMapping
    public NetworkContact add(@RequestBody NetworkContact contact) {
        return networkContactRepository.save(contact);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!networkContactRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        networkContactRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
