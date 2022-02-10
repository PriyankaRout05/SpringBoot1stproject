package com.priyanka.controller;

import com.priyanka.model.Note;
import com.priyanka.repo.NoteRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
class NoteController {
	@Autowired
	NoteRepository noteRepository;
	
	    @PutMapping("/notesave")
	    public String insertNote(@RequestBody Note note) {
		noteRepository.save(note);
		return "Hey I am accept your Request !!";
	}
	    @PostMapping("/multiplenotesave")
		public String insertNote(@RequestBody List<Note> note) {
		noteRepository.saveAll(note);
		return "Now you got a Response !!";
	
	}
	    @PostMapping("/getAllNote")
	    public List<Note> getNote() {
	    	return (List<Note>) noteRepository.findAll();
	    }
	    
	    @GetMapping("/getfindByNoteName/{name}")
	    public List<Note> getfindByNoteName(@PathVariable("name")String noteName) {
	    	return (List<Note>) noteRepository.findBynoteName(noteName);
	    }
	    @DeleteMapping("/getfindByNoteId/{noteId}")
	    public Optional<Note> getfindByNoteId(@PathVariable("noteId") Long id) {
	    	return noteRepository.findById(id);
	    }
	 
	   
} 
