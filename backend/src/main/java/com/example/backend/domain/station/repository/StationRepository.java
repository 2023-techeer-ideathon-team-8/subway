package com.example.backend.domain.station.repository;

import com.example.backend.domain.station.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface StationRepository extends JpaRepository<Station, Long> {
  @Query("SELECT s FROM Station s WHERE s.name = :name")
  public Station findByStationName(@Param("name") String name);


  @Query("SELECT s FROM Station s WHERE  s.id > :id AND s.inside = true")
  public Station findClosestStationInside(@Param("id") Long id );

  @Query("SELECT s FROM Station s WHERE s.id > :id AND s.outside = true")
  public Station findClosestStationOutside(@Param("id") Long id);

}
