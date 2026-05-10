package com.knots.backend.models.dtos;

public record InvariantDto(
    int determinant,
    String alexander_polynomial,
    String jones_polynomial
) {}
