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
}
