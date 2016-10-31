package cn.ustc.eb.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ustc.eb.mapper.UserMapper;
import cn.ustc.eb.po.User;
import cn.ustc.eb.po.UserExample;
import cn.ustc.eb.po.UserExample.Criteria;
import cn.ustc.eb.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserById(Integer id) {
		
		User user = userMapper.selectByPrimaryKey(id);
		
		return user;
	}

	@Override
	public String insertUser(User record) throws Exception {
		//insert在插入的时候返回的是插入的条数
		int row = userMapper.insertSelective(record);
		System.out.println("************** == " + row);
		
		String result = "fail";
		//如果插入的条数大于等于1，说明插入成功了
		if (row >= 1) {
			result = "success";
		}
		return result;
	}

	@Override
	public User login(User user) throws Exception {
		UserExample ue = new UserExample();
		Criteria criteria = ue.createCriteria();
		criteria.andUsernameEqualTo(user.getUsername());
		criteria.andPasswordEqualTo(user.getPassword());
		
		ArrayList<User> userList = (ArrayList<User>) userMapper.selectByExample(ue);
		
		if(userList.isEmpty()) {
			return null;
		} else {
			return userList.get(0);
		}
	}

}
