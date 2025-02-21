package com.example.artgallery.Controller;

import com.example.artgallery.Model.Artwork;
import com.example.artgallery.Repository.ArtworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artworks")
public class ArtworkController {
    @Autowired
    private ArtworkRepository artworkRepository;

    @GetMapping
    public List<Artwork> getAllArtworks() {
        return artworkRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Artwork> createArtwork(@RequestBody Artwork artwork) {
        Artwork savedArtwork = artworkRepository.save(artwork);
        return new ResponseEntity<>(savedArtwork, HttpStatus.CREATED);
    }
}
