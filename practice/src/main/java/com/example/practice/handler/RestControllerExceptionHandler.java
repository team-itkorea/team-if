package com.example.practice.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.dto.CMRespDto;
import com.example.practice.handler.exceqtion.CustomValidationApiException;

@RestController
@ControllerAdvice
public class RestControllerExceptionHandler {

	@ExceptionHandler(CustomValidationApiException.class)
	public ResponseEntity<?> validationApiExEntity(CustomValidationApiException e) {
		return ResponseEntity.badRequest().body(new CMRespDto<>(-1, e.getMessage(),e.getErrorMap()));
	}
}
