package com.crud.webapplication.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class CreateTaskRequest {
	private String title;
	private String description;
}
