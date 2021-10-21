package spring.bts.dto;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Alias("user")
@Getter
@Setter
@ToString
public class UserDto {
	int id;
	String name;
	String gender;
	String city;
	
	public UserDto() {}

	public UserDto(int id, String name, String gender, String city) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.city = city;
	}

	public UserDto(String name) {
		super();
		this.name = name;
	}
}