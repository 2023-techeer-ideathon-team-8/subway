package com.example.backend.domain.station.service;

import com.example.backend.domain.station.dto.ResponseDto;
import com.example.backend.domain.station.entity.Station;
import com.example.backend.domain.station.repository.StationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StationService {

  private final StationRepository stationRepository;

  public ResponseDto findStation(String stationName, boolean direction, boolean inside){
    Station station  = stationRepository.findByStationName(stationName);
    Station station1;
    if(inside) {
      station1 = stationRepository.findClosestStationInside(station.getId());
    }else{
      station1 = stationRepository.findClosestStationOutside(station.getId());
    }



  }
}
