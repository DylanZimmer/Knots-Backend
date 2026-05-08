package com.knots.backend.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "knots")
public class Knot {
    @Id
    private int knotId;
    private String numCrossings;
    private String rolfIndex;
}