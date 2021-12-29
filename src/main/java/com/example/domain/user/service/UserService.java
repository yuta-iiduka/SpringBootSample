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
	
	/* ユーザー取得(1件) */
	public MUser getUserOne(String userId);
	
	/* ユーザー更新(1件) */
	public void updateUserOne(String userId, String password, String userName);
	
	/* ユーザー削除 */
	public void deleteUserOne(String userId);
	
}
