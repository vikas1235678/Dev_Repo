package com.ms.userservice.valueobject;

import java.util.Optional;

import com.ms.userservice.entity.Users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
	private Optional<Users> user;
	private Department department;
}
