package cn.ustc.eb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.ustc.eb.po.User;
import cn.ustc.eb.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getUserById")
	public ModelAndView getUserById(HttpServletRequest request) throws Exception {
		
		System.out.println("*****" + request.getParameter("id"));
		
		String idStr = request.getParameter("id");
		
		int id = Integer.parseInt(idStr);
		
		User user = userService.getUserById(id);
		
		ModelAndView modelAndView = new ModelAndView();
		
		if (null != user) {
			modelAndView.addObject("user", user);
			modelAndView.setViewName("userInfo.jsp");
		} else {
			modelAndView.setViewName("error.jsp");
		}
		return modelAndView;
	}
	
	@RequestMapping("/register")
	public ModelAndView insertUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		User user = null;
		if (username != null || username != "" || password != null 
				|| password != "" || email != null || email != "") {
			user = new User();
			user.setUsername(username);
			user.setPassword(password);
			user.setEmail(email);
		} 
		request.getRequestDispatcher("error.jsp").forward(request, response);
		
		String result = userService.insertUser(user);
		
		if ("success".equals(result)) {
			System.out.println("哈哈，注册成功!");
			System.out.println("新注册的用户id ： " + user.getId());
		} else {
			System.out.println("注册失败了吧！！！");
		}
			
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("user", user);
		
		modelAndView.setViewName("userInfo.jsp");
		
		return modelAndView;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if ("".equals(username) || null == username ||
				"".equals(password) || null == password) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		ModelAndView modelAndView = new ModelAndView();
		
		user = userService.login(user);
		if (user == null) {
			modelAndView.setViewName("login.jsp");
			request.getSession().setAttribute("msg", "username or password is wrong");
		} else {
			modelAndView.addObject("user", user);
			modelAndView.setViewName("index.jsp");
		}
		return modelAndView;
	}
}
