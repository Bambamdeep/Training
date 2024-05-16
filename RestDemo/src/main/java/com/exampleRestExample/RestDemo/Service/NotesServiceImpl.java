package com.exampleRestExample.RestDemo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampleRestExample.RestDemo.Dao.NotesDao;
import com.exampleRestExample.RestDemo.Model.Notes;
import com.exampleRestExample.RestDemo.exception.DataIncorrectException;
import com.exampleRestExample.RestDemo.exception.NotesNotFoundException;

@Service
public class NotesServiceImpl implements NotesService{
@Autowired
      NotesDao notesDao;
	public NotesServiceImpl(NotesDao notesDao) {
	super();
	this.notesDao = notesDao;
}

	@Override
	public List<Notes> getAllNotes() {
		// TODO Auto-generated method stub
		return notesDao.findAll();
	}

	@Override
	public Notes insertRecord(Notes notes) throws DataIncorrectException{
		// TODO Auto-generated method stub
		return notesDao.save(notes);
		
	}

	@Override
	public boolean deleteNotes(int pid) {
		// TODO Auto-generated method stub
		notesDao.deleteById(pid);
		return true;
	}

	

	@Override
	public Optional<Notes> searchNotes(int pid) throws NotesNotFoundException{
		// TODO Auto-generated method stub
		return Optional.ofNullable(notesDao.findById(pid).orElseThrow(()->new NotesNotFoundException()));
	}

}
