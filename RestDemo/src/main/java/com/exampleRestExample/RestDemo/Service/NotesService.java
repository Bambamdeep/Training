package com.exampleRestExample.RestDemo.Service;

import java.util.List;
import java.util.Optional;

import com.exampleRestExample.RestDemo.Model.Notes;
import com.exampleRestExample.RestDemo.exception.DataIncorrectException;
import com.exampleRestExample.RestDemo.exception.NotesNotFoundException;

public interface NotesService {
public List <Notes> getAllNotes();
public Notes insertRecord(Notes notes) throws DataIncorrectException;
public boolean deleteNotes(int pid);
public Optional<Notes> searchNotes(int pid) throws NotesNotFoundException;



}
