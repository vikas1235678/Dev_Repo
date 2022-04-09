package com.learn.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.demo.entity.BookEntity;
import com.learn.demo.service.BookService;
import com.learn.demo.ui.UIData;

@RequestMapping("/book")
@RestController
public class DemoController {
	
	@Autowired
	UIData uiData;
	
	@Autowired
	BookService bookService;
	
	@RequestMapping(value = "/test2", method = RequestMethod.POST )
	public UIData weekdays(@RequestBody UIData uiData) {
		return uiData;
	}
	
	@GetMapping(value = "/test/{id}")
	public UIData pathVar(@PathVariable("id") int id) {
		uiData.setId(id);
		return uiData;
	}
	
	@GetMapping(value = "/reqpar")
	public UIData reqPar(@RequestParam int id) {
		uiData.setId(id);
		return uiData;
	}
	
	@ResponseBody
	@GetMapping("/httpres")
	public String httpRes() {
		return "Hello HTTP Res";
	}
	
	//controllers for book
	
	@PostMapping("/savebook")
	public String saveBook(@RequestBody List<BookEntity> book) {
		bookService.saveBook(book);
		return "Book saved successfully";
	}
	
	@GetMapping("/getallbooks")
	public Iterable<BookEntity> getAllBook(){
		return bookService.getAllBook();
	}
	
	@GetMapping("/getcount")
	public long getCount() {
		return bookService.noOfEntries();
	}
	
	@GetMapping("/getallbooksbyquery")
	public List<BookEntity> getAllBookByQuery(){
		return bookService.getAllBookByQuery();
	}

}
