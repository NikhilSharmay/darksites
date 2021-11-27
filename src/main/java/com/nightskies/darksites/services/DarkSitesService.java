package com.nightskies.darksites.services;

import java.util.Optional;

import com.nightskies.darksites.entities.DarkSiteEntity;
import com.nightskies.darksites.repositories.DarkSitesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DarkSitesService {
	@Autowired
    private DarkSitesRepository darkSitesRepository;
	
    public Iterable<DarkSiteEntity> fetchAll(){	
        return darkSitesRepository.findAll();
    }
    public DarkSiteEntity fetchById(Long id){
        Optional<DarkSiteEntity> darkSite = darkSitesRepository.findById(id);
        if(darkSite.isPresent())return darkSite.get();
        else return null;
    }
}
