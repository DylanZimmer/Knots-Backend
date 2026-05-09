package com.knots.backend.controllers;

import com.knots.backend.models.dtos.KnotDto;
import com.knots.backend.services.KnotService;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/knots")
@RequiredArgsConstructor
public class KnotController {

    private final KnotService knotService;

    @GetMapping("/rolf_names")
    public List<KnotDto> getGroupedKnots() {
        return knotService.getGroupedKnots();
    }

    @GetMapping("/diagram_id")
    public Integer getDiagramId( @RequestParam("num_crossings") int numCrossings, @RequestParam("rolf_index") int rolfIndex) {
        return knotService.getDiagramId(numCrossings, rolfIndex);
    }
}
