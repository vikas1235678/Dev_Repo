package com.learn.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class BookEntity {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long bookId;
	@Column
	public String bookName; 
	@Column
	public String author; 
	@Column
	public String price;
}
