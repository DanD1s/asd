package com.example.artgallery.Repository;

import com.example.artgallery.Model.Artwork;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtworkRepository extends JpaRepository<Artwork, Long> {}

