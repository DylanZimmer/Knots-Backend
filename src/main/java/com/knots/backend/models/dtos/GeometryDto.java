package com.knots.backend.models.dtos;

import java.util.List;

public record GeometryDto (
        List<List<Integer>> vertex_positions,
        List<List<Integer>> arrows,
        List<List<Integer>> crossingSpecs
) {}
