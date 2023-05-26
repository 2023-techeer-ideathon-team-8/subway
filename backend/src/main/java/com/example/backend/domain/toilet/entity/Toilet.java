package com.example.backend.domain.toilet.entity;

import com.example.backend.domain.station.entity.Station;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "TOILET")
public class Toilet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "toilet_id")
    private Long id;

    @Column(name = "exit")
    private String exit;

    @Column(name = "location")
    private String location;

    @ManyToOne
    @JoinColumn(name = "station_id")
    private Station station;
}
