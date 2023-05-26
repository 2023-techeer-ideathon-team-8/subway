package com.example.backend.domain.toilet.repository;

import com.example.backend.domain.toilet.dto.ToiletResponse;
import com.example.backend.domain.toilet.entity.Toilet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface ToiletRepository extends JpaRepository<Toilet, Long> {
    @Query("SELECT t FROM Toilet t WHERE t.station.id = :stationId AND t.inside = :inside")
    List<ToiletResponse> findByStationAndInside(Long stationId, boolean inside);
}
