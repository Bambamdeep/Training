package com.exampleRestExample.RestDemo.exception;

public class NotesNotFoundException extends RuntimeException{
public NotesNotFoundException() {
	super("Note not found with the given id");
}
}
