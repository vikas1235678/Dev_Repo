package com.learn.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.demo.entity.BookEntity;
import com.learn.demo.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepo;
	
	public void saveBook(List<BookEntity> book) {
		bookRepo.saveAll(book);
	}

	public Iterable<BookEntity> getAllBook() {
		return bookRepo.findAll();
	}
	
	public long noOfEntries() {
		return bookRepo.count();
	}
	
	public List<BookEntity> getAllBookByQuery(){
		return bookRepo.getAllBookByQuery();
	}
		

}
