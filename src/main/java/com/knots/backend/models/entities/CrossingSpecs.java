package com.knots.backend.models.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class CrossingSpecs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer csId;
    private Integer diagramId;
    private Integer extension;
    private Integer crossingId;
    private Integer underLine;
    private Integer overLine;
    @Column(name = "crossing_x")
    private Integer crossingX;
    @Column(name = "crossing_y")
    private Integer crossingY;
}