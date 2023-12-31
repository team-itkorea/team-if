package com.example.practice.dto;

import com.example.practice.user.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 클라이언트가 보내는 것들
public class SignupReqDto {
	private String userName;
	private String userEmail;
	private String userPassword;
	private String userAddress;
	private String userPhone;
	private int userGender;
	private String userBirth;
	private String userProfileImg;
	private String userRole;
	
	public User toEntity() {
		return User.builder()
				.user_name(userName)
				.user_email(userEmail)
				.user_password(userPassword)
				.user_address(userAddress)
				.user_phone(userPhone)
				.user_gender(userGender)
				.user_birth(userBirth)
				.user_profile_img(userProfileImg)
				.user_role("ROLE_USER")
				.build();
	}
}
