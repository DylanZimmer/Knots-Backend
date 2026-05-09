package com.knots.backend.repositories;

import com.knots.backend.models.entities.Knots;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface KnotRepo extends JpaRepository<Knots, Integer> {

    @Query(value = """
        SELECT num_crossings,
            array_agg(rolf_index)
        FROM knots
        GROUP BY num_crossings
        ORDER by num_crossings
        """, nativeQuery = true)
    List<Object[]> getGroupedKnotsRaw();

    @Query("""
        SELECT d.diagramId
        FROM DiagramsRolf d
        JOIN Knots k ON k.knotId = d.knotId
        WHERE k.numCrossings = :nc
        AND k.rolfIndex = :ri
    """)
    Integer findDiagramId(String nc, String ri);
}