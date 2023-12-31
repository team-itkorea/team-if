package com.example.practice.auth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.practice.user.User;

// 시큐리티가 /login 주소 요청을 낚아채서 로그인을 진행
// 로그인이 완료 되면 시큐리티 session을 만듬 (Security ContextHolder)
// 오브젝트 => Authentication 타입의 객체
// Authentication 안에 User정보가 있어야 함
// User 오브젝트 타입 => UserDetails 타입 객체

// Security Session => Authentication => UserDetails(PrincipalDetails)
// UserDetails(사용자의 정보를 담는 인터페이스)
public class PrincipalDetails implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	private User user;
	private Map<String, Object> attribute;
	
	public PrincipalDetails(User user) {
		this.user = user;
	}
	
	public PrincipalDetails(User user, Map<String,Object> attribute) {
		this.user = user;
		this.attribute = attribute;
	}
	
	// 해당 유저의 권한을 리턴하는 곳
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// ArrayList는 Collection의 자식
		Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
		grantedAuthorities.add(new GrantedAuthority() {
			private static final long serialVersionUID = 1L;
			
			@Override
			public String getAuthority() {
				return user.getUser_role();
			}
		});
		return grantedAuthorities;
	}


	
	@Override
	public String getPassword() {
		return user.getUser_password();
	}

	@Override
	public String getUsername() {
		return user.getUser_email();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// 휴면 계정이 되면
		return true;
	}

}
