package com.example.practice.controller.auth;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.auth.PrincipalDetailsService;
import com.example.practice.dto.CMRespDto;
import com.example.practice.dto.SignupReqDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
	private final PrincipalDetailsService principalDetailsService;

//	@PostMapping("/join")
//	public ResponseEntity<?> signup(@RequestBody @Valid SignupReqDto signupReqDto, BindingResult bicdingResult) {
//		boolean status = false;
//		try {
//			status = principalDetailsService.addUser(signupReqDto);
//		} catch (Exception e) {
//			e.printStackTrace();
//			return ResponseEntity.ok().body(new CMRespDto<>(-1, "회원가입 실패",status));
//		}
//		return ResponseEntity.ok().body(new CMRespDto<>(1, "회원가입 성공", status));
//	}
}
