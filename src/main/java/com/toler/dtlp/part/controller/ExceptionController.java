package com.toler.dtlp.part.controller;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Collections;
import java.util.Map;

import org.springframework.http.HttpStatus;

import com.toler.dtlp.part.exception.NoPartException;

@RestControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(NoPartException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Map<String, String> missingMovie(NoPartException e) {
		return Collections.singletonMap("error", "part " + e.getPartId() + " not found.");
	}
}
