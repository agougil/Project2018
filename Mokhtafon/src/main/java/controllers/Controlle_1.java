package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlle_1 {
	@RequestMapping("/addusdr")
	public void adduser(HttpServletRequest request,HttpServletResponse response){
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String uname=request.getParameter("username");
		String phone=request.getParameter("phone");
		String Addresse=request.getParameter("address");
		String pass=request.getParameter("password");
		Personne p=new Personne(name,uname,email,Addresse,phone,pass,"","","");
		
	}
}
