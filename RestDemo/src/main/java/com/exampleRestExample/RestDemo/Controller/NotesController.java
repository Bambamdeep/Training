package com.exampleRestExample.RestDemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.exampleRestExample.RestDemo.Model.Notes;
import com.exampleRestExample.RestDemo.Service.NotesService;
import com.exampleRestExample.RestDemo.exception.DataIncorrectException;
import com.exampleRestExample.RestDemo.exception.NotesNotFoundException;

@RestController
@RequestMapping("/notes")
public class NotesController {


@Autowired
NotesService service;

@GetMapping
@ResponseStatus(HttpStatus.OK)
public List<Notes> displayAllNotes() {
	return service.getAllNotes();
}
@PostMapping
@ResponseStatus(HttpStatus.CREATED)

public Notes insertRecord(@RequestBody Notes notes) {
	if (notes.getPid() ==0 || notes.getAuthor() == null || notes.getDescription() == null || notes.getTitle() == null) {
		 throw new  DataIncorrectException ();
	}
	return service.insertRecord(notes);
}

@GetMapping("/search/{pid}")
@ResponseStatus(HttpStatus.OK)
public Notes searchNotes(@PathVariable int pid) throws NotesNotFoundException{
	return service.searchNotes(pid).get();
}

@DeleteMapping("/delete/{pid}")
@ResponseStatus(HttpStatus.NO_CONTENT)
public boolean deleteNotes(@PathVariable int pid) {
	return service.deleteNotes(pid);
}
                                                       
}