package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dspesquisa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
