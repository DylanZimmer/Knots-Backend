package com.knots.backend.repositories;

import com.knots.backend.models.entities.InvariantsRolf;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InvariantRolfRepo extends JpaRepository<InvariantsRolf, Integer> {
    InvariantsRolf findByKnotId(Integer knotId);
}
