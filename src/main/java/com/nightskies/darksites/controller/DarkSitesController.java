package com.nightskies.darksites.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nightskies.darksites.models.Contribution;
import com.nightskies.darksites.services.ContributionsService;

@RestController
@RequestMapping("/darkSites")
public class DarkSitesController {
	@Autowired
	private ContributionsService contributionsService;
	
 	@PostMapping(value="/add",produces = MediaType.APPLICATION_JSON_VALUE)
	public Boolean add(@RequestBody Contribution contribution) {
		return contributionsService.add(contribution);
	}
}
