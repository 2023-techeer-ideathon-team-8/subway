package com.example.backend.domain.subwayline.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "SUBWAYLINE")
public class SubwayLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "line_id")
    private Long id;

    @Column(nullable = false)
    private int line;
}
