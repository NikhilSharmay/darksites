package com.nightskies.darksites.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nightskies.darksites.entities.ContributionEntity;
import com.nightskies.darksites.entities.DarkSiteEntity;
import com.nightskies.darksites.services.DarkSitesService;

@RestController
@RequestMapping(value = "/darksites", produces = MediaType.APPLICATION_JSON_VALUE)
public class DarkSitesController {
	@Autowired
	private DarkSitesService darkSitesService;

	@GetMapping("/fetchAll")
	public Iterable<DarkSiteEntity> fetchAll() {
		return darkSitesService.fetchAll();
	}

	@GetMapping("/fetch/{id}")
	public ContributionEntity fetchById(@PathVariable("id") Long id) {
		return darkSitesService.fetchById(id);
	}

}
