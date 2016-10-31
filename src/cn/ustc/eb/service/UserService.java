package cn.ustc.eb.service;

import cn.ustc.eb.po.User;

public interface UserService {
	//通过id查找一个user，返回一个user对象
	public User getUserById(Integer id) throws Exception;
	
	//插入一个user对象,返回插入的结果，String类型， 相当于用户注册的功能
	public String insertUser(User record) throws Exception;
	
	//用户登录
	public User login(User user) throws Exception;
}
