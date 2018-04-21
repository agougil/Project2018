package com.miniprojet.mokhtafonVspring.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.miniprojet.mokhtafonVspring.model.Personne;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	/*@RequestMapping(value="/mokhtafonVspring/adduser")
	public void adduser(HttpServletRequest request,HttpServletResponse response){
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String uname=request.getParameter("username");
		String phone=request.getParameter("phone");
		String Addresse=request.getParameter("address");
		String pass=request.getParameter("password");
		Personne p=new Personne(name,uname,email,Addresse,phone,pass,"","","");
		System.out.println("great work");
	}*/
}
