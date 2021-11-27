package com.nightskies.darksites.models;

import lombok.Data;

@Data
public class DarkSite {
	private Long id;
	private double latitude;
	private double longitude;
	private String locationName;
}
