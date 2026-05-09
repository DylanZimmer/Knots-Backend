package com.knots.backend.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DiagramsRolf {
    @Id
    private int drId;
    private int knotId;
    private String nameRolf;
    private String conversionForFullNotation;
    private String startLine;
    private int diagramId;
}
