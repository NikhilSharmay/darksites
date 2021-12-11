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
@RequestMapping(value = "/contribution",produces = MediaType.APPLICATION_JSON_VALUE)
public class ContributionsController {
	
	@Autowired
	private ContributionsService contributionsService;
	
 	@PostMapping("/add")
	public Boolean add(@RequestBody Contribution contribution) {
		return contributionsService.add(contribution);
	}
 	
 	@PostMapping("/update")
 	public Boolean update(@RequestBody Contribution contribution) {
 		return contributionsService.update(contribution);
 	}
 	
}
