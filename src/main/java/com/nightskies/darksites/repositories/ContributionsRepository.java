package com.nightskies.darksites.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nightskies.darksites.entities.ContributionEntity;

public interface ContributionsRepository extends CrudRepository<ContributionEntity, Long> {
    
}
