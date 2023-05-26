package com.example.backend.domain.toilet.service;

import com.example.backend.domain.toilet.dto.ToiletResponse;
import com.example.backend.domain.toilet.entity.Toilet;
import com.example.backend.domain.toilet.repository.ToiletRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class ToiletService {
    private final ToiletRepository toiletRepository;

    public List<ToiletResponse> findByStationAndInside(Long stationId, boolean inside){
        List<ToiletResponse> toiletResponses = toiletRepository.findByStationAndInside(stationId, inside);
        return toiletResponses;
    }
}
