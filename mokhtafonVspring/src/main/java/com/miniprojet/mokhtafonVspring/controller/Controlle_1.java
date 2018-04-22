package com.miniprojet.mokhtafonVspring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.miniprojet.mokhtafonVspring.data.DB;
import com.miniprojet.mokhtafonVspring.data.IDAO;
import com.miniprojet.mokhtafonVspring.model.Personne;

@Controller
public class Controlle_1 {
	IDAO idao=new DB();
	@RequestMapping(value = "/addUser")
	public ModelAndView adduser(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String uname = request.getParameter("username");
		String phone = request.getParameter("phone");
		String Addresse = request.getParameter("address");
		String pass = request.getParameter("password");
		Personne p = new Personne(name, uname, email, Addresse, phone, pass, "");
		//Personne p=new Personne("test","test","test5","test","test","test","test");
		idao.addUser(p);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}

	@RequestMapping(value = "/addArticle")
	public void addarticle(HttpServletRequest request, HttpServletResponse response) {
	
	}
	@RequestMapping("/loginCheck")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mv=null;
		String email=request.getParameter("email");
		String pass=request.getParameter("Password");
		//Personne p=idao.getUserByEmail(email);
		if(email.equals("aaa@aaa.aaa") && pass.equals("123456")){
				mv=new ModelAndView();
				mv.setViewName("home");
				
		}
		else {
			mv=new ModelAndView();
			mv.setViewName("login");
		}
		return mv;
		
	}
	@RequestMapping(value="/login")
	public String loginView(){
		return "login";
	}
	@RequestMapping(value="/register")
	public String registerView(){
		return "register";
	}
}
