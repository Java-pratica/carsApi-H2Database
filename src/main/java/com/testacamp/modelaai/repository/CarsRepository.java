package com.testacamp.modelaai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testacamp.modelaai.models.CarsModels;

@Repository
public interface CarsRepository extends JpaRepository <CarsModels, Long>  {
    
}
