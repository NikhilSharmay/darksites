package com.nightskies.darksites.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nightskies.darksites.entities.UserEntity;

public interface UsersRepository extends CrudRepository<UserEntity, Long> {

}
