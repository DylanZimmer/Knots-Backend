package com.knots.backend.models.dtos;

import java.util.List;

public record KnotDto(
        String numCrossings,
        List<String> rolfIndexes
) {}