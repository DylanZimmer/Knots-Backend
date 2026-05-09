package com.knots.backend.services;

import com.knots.backend.models.dtos.GeometryDto;
import com.knots.backend.repositories.VerticesAndArrowsRepo;
import com.knots.backend.models.entities.VerticesAndArrowsRolf;
import com.knots.backend.repositories.CrossingSpecsRepo;
import com.knots.backend.models.entities.CrossingSpecsRolf;

import org.springframework.stereotype.Service;
import java.util.*;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GeometryService {

    private final VerticesAndArrowsRepo verticesAndArrowsRepo;
    private final CrossingSpecsRepo crossingSpecsRepo;

    public GeometryDto getGeometryByDiagramId(int diagramId) {

        List<VerticesAndArrowsRolf> vs_and_as =
                verticesAndArrowsRepo.findAllByDiagramIdOrderByStartPointAsc(diagramId);

        List<CrossingSpecsRolf> c_specs =
                crossingSpecsRepo.findAllByDiagramIdOrderByCrossingIdAsc(diagramId);

        List<List<Integer>> crossingSpecsList = new ArrayList<>();
        List<List<Integer>> verticesList = new ArrayList<>();
        List<List<Integer>> arrowsList = new ArrayList<>();

        for (CrossingSpecsRolf c : c_specs) {
            crossingSpecsList.add(
                    List.of(
                            c.getCrossingId(),
                            c.getUnderLine(),
                            c.getOverLine()
                    )
            );
        }
        for (VerticesAndArrowsRolf va : vs_and_as) {
            verticesList.add(
                    List.of(
                            va.getStrandX(),
                            va.getStrandY()
                    )
            );
            arrowsList.add(
                    List.of(
                            va.getStartPoint(),
                            va.getEndPoint()
                    )
            );
        }

        return new GeometryDto(
                verticesList,
                arrowsList,
                crossingSpecsList
        );
    }
}
