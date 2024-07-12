package com.Handson3.Handson3.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Handson3.Handson3.Model.TravelAgency;

public interface TravelAgencyDao extends JpaRepository<TravelAgency,Integer> {
    
public	TravelAgency findById(int id);
}
