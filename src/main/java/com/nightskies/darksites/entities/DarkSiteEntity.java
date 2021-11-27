package com.nightskies.darksites.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name="darksites")
public class DarkSiteEntity {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;
    private double latitude;
    private double longitude;
    @Column(name="location_name")
    private String locationName;
}
