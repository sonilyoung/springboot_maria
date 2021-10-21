package spring.bts.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.bts.dao.UserDao;
import spring.bts.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;
	
	@Autowired
	SqlSessionTemplate session;
	
	@Override
	public List<UserDto> userList() {
		return dao.userList(session);
	}

}