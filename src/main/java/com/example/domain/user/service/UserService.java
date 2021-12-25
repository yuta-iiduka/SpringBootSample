package com.example.domain.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.domain.user.model.MUser;

@Service
public interface UserService {
	/* ユーザー登録 */
	public void signup(MUser user);
	
	/* ユーザー取得 */
	public List<MUser> getUsers();
	
}
