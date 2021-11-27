package com.nightskies.darksites.mapper;

import com.nightskies.darksites.entities.ContributionEntity;
import com.nightskies.darksites.entities.DarkSiteEntity;
import com.nightskies.darksites.entities.UserEntity;
import com.nightskies.darksites.models.Contribution;
import com.nightskies.darksites.models.DarkSite;
import com.nightskies.darksites.models.User;


public class ModelEntityMapper{

	public static Contribution toDto(ContributionEntity entity) {
		Contribution dto = new Contribution();
		dto.setCampingAllowed(entity.isCampingAllowed());
		dto.setDescription(entity.getDescription());
		dto.setPhotos(entity.getPhotos());
		dto.setHotelsAvailable(entity.isHotelsAvailable());
		dto.setHorizonVisibility(entity.getHorizonVisibility());
		dto.setUser(toDto(entity.getUserEntity()));
		return dto;
	}

	public static DarkSite toDto(DarkSiteEntity entity) {
		DarkSite dto = new DarkSite();
		dto.setLatitude(entity.getLatitude());
		dto.setLongitude(entity.getLongitude());
		dto.setLocationName(entity.getLocationName());
		return dto;
	}

	public static User toDto(UserEntity entity) {
		User dto = new User();
		dto.setId(entity.getId());
		return dto;
	}

	public static ContributionEntity toEntity(Contribution dto) {
		ContributionEntity entity = new ContributionEntity();
		entity.setCampingAllowed(dto.isCampingAllowed());
		entity.setDarkSiteEntity(toEntity(dto.getDarkSite()));
		entity.setDescription(dto.getDescription());
		entity.setPhotos(dto.getPhotos());
		entity.setHotelsAvailable(dto.isHotelsAvailable());
		entity.setHorizonVisibility(dto.getHorizonVisibility());
		entity.setUserEntity(toEntity(dto.getUser()));
		return entity;
	}

	public static DarkSiteEntity toEntity(DarkSite dto) {
		DarkSiteEntity entity = new DarkSiteEntity();
		entity.setLatitude(dto.getLatitude());
		entity.setLongitude(dto.getLongitude());
		entity.setLocationName(dto.getLocationName());
		return entity;
	}

	public static UserEntity toEntity(User dto) {
		UserEntity entity = new UserEntity();
		entity.setId(dto.getId());
		return entity;
	}

}
