package com.nightskies.darksites.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.nightskies.darksites.entities.ContributionEntity;
import com.nightskies.darksites.entities.DarkSiteEntity;
import com.nightskies.darksites.entities.UserEntity;
import com.nightskies.darksites.mapper.ModelEntityMapper;
import com.nightskies.darksites.models.Contribution;
import com.nightskies.darksites.repositories.ContributionsRepository;
import com.nightskies.darksites.repositories.DarkSitesRepository;
import com.nightskies.darksites.repositories.UsersRepository;

@Service
public class ContributionsService {
	@Autowired
	private ContributionsRepository contributionsRepository;
	@Autowired
	private DarkSitesRepository darkSitesRepository;
	@Autowired
	private UsersRepository usersRepository;
	public Boolean add(Contribution contribution){
		DarkSiteEntity darkSiteEntity = darkSitesRepository.save(ModelEntityMapper.toEntity(contribution.getDarkSite()));
		UserEntity userEntity = usersRepository.save(ModelEntityMapper.toEntity(contribution.getUser()));
		//Optional<UserEntity> userEntity = usersRepository.findById(contribution.getUser().getId());
		//if(userEntity.isEmpty())return null;
		ContributionEntity contributionEntity = ModelEntityMapper.toEntity(contribution);
		contributionEntity.setUserEntity(userEntity);
		contributionEntity.setDarkSiteEntity(darkSiteEntity);
		System.out.println(ModelEntityMapper.toDto(contributionsRepository.save(contributionEntity)).toString());
		return true;
	}
	public Boolean update(Contribution contribution) {
//		darkSitesRepository.
		return null;
	}
}
