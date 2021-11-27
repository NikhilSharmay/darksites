package com.nightskies.darksites.models;

import java.util.List;

import lombok.Data;


@Data
public class Contribution {
	private User user;
	private DarkSite darkSite;
    private int horizonVisibility;
    private String description;
    private List<String> photos;
    private boolean isHotelsAvailable;
    private boolean isCampingAllowed;
}
