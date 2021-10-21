package spring.bts.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import spring.bts.dto.UserDto;


public interface UserDao {
	public abstract List<UserDto> userList(SqlSessionTemplate session);
}