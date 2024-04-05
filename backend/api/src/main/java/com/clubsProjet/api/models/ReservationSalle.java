package com.clubsProjet.api.models;

import java.time.LocalDate;
import java.time.LocalTime;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "ReservationsSalle")
public class ReservationSalle {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="salle_id")
	private Salle salle;
	private LocalDate jour;
	private LocalTime heureDebut;
	private LocalTime heureFin;
}
