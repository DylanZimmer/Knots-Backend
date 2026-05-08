package com.knots.backend.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class VerticesAndArrowsRolf {
    @Id
    private int vaId;
    private int diagramId;
    private int startPoint;
    private int endPoint;
    @Column(name="strand_x")
    private int strandX;
    @Column(name="strand_y")
    private int strandY;
}
