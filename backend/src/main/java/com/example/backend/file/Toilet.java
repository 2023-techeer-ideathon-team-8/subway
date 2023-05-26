package com.example.backend.file;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;

@Entity
@Getter
//@Table(name = "TOILET")
public class Toilet {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  @Column(name = "toilet_id")
  private Long id;

//  @Column(name = "exit")
  private int exitStation;

//  @Column(name = "location")
  private String location;

//  @ManyToOne(fetch = FetchType.LAZY)
//  @JoinColumn(name = "station_id")
//  private Station station;
}