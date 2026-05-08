package com.knots.backend.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CrossingSpecsRolf {
    @Id
    private int csId;
    private int diagramId;
    private int crossingId;
    private int underLine;
    private int overLine;
    @Column(name="crossing_x")
    private int crossingX;
    @Column(name="crossing_y")
    private int crossingY;
}
