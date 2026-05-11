package com.knots.backend.repositories;

import com.knots.backend.models.entities.VerticesAndArrows;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VerticesAndArrowsRepo extends JpaRepository<VerticesAndArrows, Integer> {
}