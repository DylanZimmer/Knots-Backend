package com.knots.backend.models.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class VerticesAndArrows {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vaId;
    private Integer diagramId;
    private Integer extension;
    private Integer startPoint;
    private Integer endPoint;
    @Column(name="strand_x")
    private Integer strandX;
    @Column(name="strand_y")
    private Integer strandY;
}
