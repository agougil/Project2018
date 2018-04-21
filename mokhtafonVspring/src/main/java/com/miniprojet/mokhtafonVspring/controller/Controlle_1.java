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
	
	@RequestMapping(value = "/addUser")
	public ModelAndView adduser(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String uname = request.getParameter("username");
		String phone = request.getParameter("phone");
		String Addresse = request.getParameter("address");
		String pass = request.getParameter("password");
		//Personne p = new Personne(name, uname, email, Addresse, phone, pass, "");
		Personne p=new Personne("test","test","test","test","test","test","test");
		IDAO idao;
		idao=new DB();
		idao.addUser(p);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}

	@RequestMapping(value = "/addArticle")
	public void addarticle(HttpServletRequest request, HttpServletResponse response) {
	
	}
}
