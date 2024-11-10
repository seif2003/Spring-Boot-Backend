package com.seif.taches.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seif.taches.entities.Image;

public interface ImageRepository extends JpaRepository<Image, Long>{

}
