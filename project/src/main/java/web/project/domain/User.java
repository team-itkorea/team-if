package web.project.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
<<<<<<< HEAD
	private String username;
	private String userid;
	private String category;
	private String phone;
	private String email;
	private String details;
=======
	private int user_code;
	private String user_name;
	private String user_id;
	private String user_address;
	private String user_phone;
	private int user_gender;
	private String user_password;
	private String user_profile_img;
	private String user_email;
>>>>>>> a0c7763d90be96d8aa0a37dae93b4fb4117ed18d
}
