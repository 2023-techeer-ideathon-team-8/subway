package com.example.backend.domain.station.controller;

import com.example.backend.domain.station.dto.ResponseDto;
import com.example.backend.domain.station.service.StationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StationController {
  private final StationService stationService;

  @GetMapping("/station")
  public ResponseEntity<ResponseDto> getStation(@RequestParam String station_name,
                                    @RequestParam Boolean direction,
                                    @RequestParam Boolean inside){
    return ;

    @GetMapping
    public ResponseEntity<Object> getInsideToilet(@PathVariable Long id, @RequestParam boolean inside){
        List<ToiletResponse> toiletResponses = toiletService.findByStationAndInside(id, inside);
        return ResponseEntity.ok(toiletResponses);
    }
}