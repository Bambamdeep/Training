package com.exampleRestExample.RestDemo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.exampleRestExample.RestDemo.Model.Notes;
import com.exampleRestExample.RestDemo.Service.NotesService;

@SpringBootTest
@AutoConfiguration
public class ModelControllerTest {
	@Autowired
	Mock mvcmock;
@MockBean
NotesService service;


@Test
public void testGetAllNotes() throws Exception{
	Notes note1 = new Notes(15,"Deepak","Spring","Java");
	Notes note2 = new Notes(15,"Bambam","Language","C++");
	Notes note3 = new Notes(15,"Narend","GE","EE");
	List<Notes> note = new ArrayList<>();
	note.add(note1);note.add(note2);note.add(note3);
	Mockito.when(service.getAllNotes()).thenReturn(note);
	
//	mockMvc.perform(get("/users/all"))
//			.andExpect(status().isOk())
//			.andExpect(jsonPath("$[0].id",is(100001)))
//			.andExpect(jsonPath("$[1].username",is("sunil")))
//			.andExpect(jsonPath("$[2].email",is("mahesh@gmail.com")));
//}


 }
}
