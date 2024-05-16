package com.exampleRestExample.RestDemo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampleRestExample.RestDemo.Model.Notes;

public interface NotesDao extends JpaRepository<Notes , Integer>{

}
