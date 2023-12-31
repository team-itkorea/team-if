package com.example.practice.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
// DB의 열값이랑 이름 똑같이
public class User {
	private int user_code;
	private String user_name;
	private String user_email;
	private String user_password;
	private String user_address;
	private String user_phone;
	private int user_gender;
	private String user_birth;
	private String user_profile_img;
	private String user_role;
}
