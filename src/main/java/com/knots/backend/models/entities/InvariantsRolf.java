package com.knots.backend.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class InvariantsRolf {
    @Id
    private int knotId;
    private int determinant;
    private String alexander_polynomial;
    private String jones_polynomial;
}
