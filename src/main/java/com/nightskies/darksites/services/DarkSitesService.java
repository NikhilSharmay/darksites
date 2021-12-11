package com.nightskies.darksites.services;

import java.util.Optional;

import com.nightskies.darksites.entities.ContributionEntity;
import com.nightskies.darksites.entities.DarkSiteEntity;
import com.nightskies.darksites.repositories.ContributionsRepository;
import com.nightskies.darksites.repositories.DarkSitesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DarkSitesService {
	@Autowired
    private DarkSitesRepository darkSitesRepository;
	@Autowired
	private ContributionsRepository contributionsRepository;
    public Iterable<DarkSiteEntity> fetchAll(){	
        return darkSitesRepository.findAll();
    }
    public ContributionEntity fetchById(Long id){
        Optional<ContributionEntity> contribution = contributionsRepository.findById(id);
        if(contribution.isPresent())return contribution.get();
        else return null;
    }
}
