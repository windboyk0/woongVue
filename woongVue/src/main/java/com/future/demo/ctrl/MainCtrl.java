package com.future.demo.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.future.demo.mapper.MainDao;
import com.future.demo.vo.User;

@Controller
public class MainCtrl {
	public String getIndexPage() {
		return "index";
	}
	
	@Autowired
	MainDao mainDao;
	
	@GetMapping("/user") // requestmapping method=RequestMethod.GET가 포함되어 있다.
    @ResponseBody
	public List<User> getUserList() throws Exception {
		return mainDao.getUserList();
	}

}
