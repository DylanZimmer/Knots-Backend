package com.knots.backend.services;

import com.knots.backend.models.dtos.KnotDto;
import com.knots.backend.repositories.KnotRepo;

import org.springframework.stereotype.Service;
import java.util.*;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class KnotService {

    private final KnotRepo knotRepo;

    public List<KnotDto> getGroupedKnots() {
        return knotRepo.getGroupedKnotsRaw().stream().map(row -> new KnotDto(
                (String) row[0],
                Arrays.asList((String[]) row[1])
        )).toList();
    }

    public Integer getDiagramId(int crossing_num, int rolf_index) {
        return knotRepo.findDiagramId(crossing_num, rolf_index);
    }
}
