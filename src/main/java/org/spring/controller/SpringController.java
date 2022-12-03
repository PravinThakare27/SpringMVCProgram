package org.spring.controller;

import org.spring.controller.ServicePro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;
import java.util.List;

import org.spring.pojo.*;

@Controller
public class SpringController {
	@Autowired
	ServicePro s;

	@RequestMapping("/index")
	ModelAndView insert(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("city") String city,@RequestParam("email") String email,@RequestParam("password") String password) throws ClassNotFoundException, SQLException
	{
		employee e=new employee(id,email,password,city,name);
		
		List<employee> l=s.insert(e);
		return new ModelAndView("success","msg",l);
		
	}
	@RequestMapping("/fetch")
	ModelAndView fetch()
	{
		
		
		List<employee>e =		s.fetch();
		return new ModelAndView("Regi","all",e);
		
	}
}
