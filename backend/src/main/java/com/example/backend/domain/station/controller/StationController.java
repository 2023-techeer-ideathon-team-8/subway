package com.example.backend.domain.station.controller;

import com.example.backend.domain.toilet.dto.ToiletResponse;
import com.example.backend.domain.toilet.service.ToiletService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/v1/station")
@RequiredArgsConstructor
public class StationController {
    private final ToiletService toiletService;
    @GetMapping
    public ResponseEntity<Object> getInsideToilet(@PathVariable Long id, @RequestParam boolean inside){
        List<ToiletResponse> toiletResponses = toiletService.findByStationAndInside(id, inside);
        return ResponseEntity.ok(toiletResponses);
    }
}
