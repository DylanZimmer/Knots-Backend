package com.knots.backend.models.keys;

import jakarta.persistence.Embeddable;

@Embeddable
public class DiagramKey {
    private Integer diagramId;
    private Integer extension;
}