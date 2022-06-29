package com.simplilearn.sportyShoes.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.sportyShoes.model.Shoe;

@Repository
public interface ShoesRepository extends JpaRepository<Shoe, Integer>{
	
}
