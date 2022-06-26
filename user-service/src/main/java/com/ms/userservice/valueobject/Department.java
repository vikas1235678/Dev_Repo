package com.ms.userservice.valueobject;

import lombok.Data;

@Data
public class Department {
	private Long departmentId;
	private String departmentName;
	private String departmenAddress;
	private String departmentCode;
}
