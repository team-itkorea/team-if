package web.project.web.controller.api;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.val;
import web.project.service.auth.AuthService;
import web.project.web.dto.CMRespDto;
import web.project.web.dto.SignupReqDto;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController { 
	private final AuthService authService;
	
	@PostMapping("/signup")
	public ResponseEntity<?>signup(@RequestBody @Valid SignupReqDto signupReqDto){
		return ResponseEntity.ok().body(new CMRespDto<>());
	}

}
