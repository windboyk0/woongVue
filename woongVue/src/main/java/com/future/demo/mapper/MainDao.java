package com.future.demo.mapper;

import java.util.List;
import com.future.demo.vo.User;

public interface MainDao {
	public List<User> getUserList () throws Exception;
}
