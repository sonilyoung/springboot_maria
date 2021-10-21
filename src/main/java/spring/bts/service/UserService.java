package spring.bts.service;

import java.util.List;

import spring.bts.dto.UserDto;

public interface UserService {
	public abstract List<UserDto> userList();

}