package com.priyanka.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priyanka.model.Note;

public interface NoteRepository extends JpaRepository<Note,Long> {
	public List<Note> findBynoteName(String name);
	

}