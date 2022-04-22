package com.coding404.myweb.user;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding404.myweb.command.HistoryVO;
import com.coding404.myweb.command.UserVO;
import com.coding404.myweb.command.loginVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public int join(UserVO vo) {         //회원가입
		return userMapper.join(vo);
	}

	@Override
	public UserVO login(loginVO vo) {    //로그인
		return userMapper.login(vo);
	}

	@Override
	public int userUpdate(UserVO vo) {    //회원정보수정
		return userMapper.userUpdate(vo);
	}

	@Override
	public ArrayList<HistoryVO> getHistory(String user_id) { //이력 list 조회
		return userMapper.getHistory(user_id);
	}





	

}
