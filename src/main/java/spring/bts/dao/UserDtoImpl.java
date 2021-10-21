package spring.bts.dao;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import spring.bts.dto.UserDto;

@Repository
public class UserDtoImpl implements UserDao{

	@Override
	public List<UserDto> userList(SqlSessionTemplate session) {
		return session.selectList("UserMapper.userList");
	}

}