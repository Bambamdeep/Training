package com.SecurityBasic.SecurityBasic.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SecurityBasic.SecurityBasic.Model.Person;

public interface PersonDao extends JpaRepository<Person,Integer>{

}
