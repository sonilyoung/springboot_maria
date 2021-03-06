package spring.bts.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.bts.dto.UserDto;
import spring.bts.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService service;
		
	@RequestMapping("/")
	public ModelAndView SelectAllFromUser() {
		ModelAndView mav = new ModelAndView("test");
		List<UserDto> userList = service.userList();
		mav.addObject("list",userList);
		return mav;
	}

}