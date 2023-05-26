package com.example.backend.domain.station.entity;

import com.example.backend.domain.subwayline.entity.SubwayLine;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "STATION")
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "station_id")
    private Long id;

    @Column(name = "station_name",nullable = false)
    private String name;

    @Column(nullable = false)
    private int priority;

    @Column(nullable = false)
    private boolean is_toilet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "line_id")
    private SubwayLine subwayLine;
}
