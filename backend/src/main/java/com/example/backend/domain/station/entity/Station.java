package com.example.backend.domain.station.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static lombok.AccessLevel.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = PROTECTED)
@Table(name = "STATION")
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "station_id")
    private Long id;

    @Column(name = "station_name",nullable = false)
    private String name;

    @Column(nullable = false)
    private boolean outside;
    @Column(nullable = false)
    private boolean inside;


}
