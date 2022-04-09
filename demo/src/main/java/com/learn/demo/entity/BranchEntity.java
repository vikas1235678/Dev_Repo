package com.learn.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class BranchEntity {
	
	@Column
	@Id
	public Long branchCode;
	@Column
	public String branchName;
	@Column
	public String noOfStudent;
	
}
