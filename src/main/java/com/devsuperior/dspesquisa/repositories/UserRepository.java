package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dspesquisa.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
