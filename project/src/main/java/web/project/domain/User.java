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
	private int user_code;
	private String user_name;
	private String user_id;
	private String user_address;
	private String user_phone;
	private int user_gender;
	private String user_password;
	private String user_profile_img;
	private String user_email;
}
