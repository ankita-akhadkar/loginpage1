package com.ankita.TheKiranAcademy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.sqm.tree.expression.SqmExpression;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {

	@Autowired
	SessionFactory sf;
	
	@RequestMapping("loginpage")
	public String loginpage() {
		return "userlogin";
		
	}

	@RequestMapping("userlogin")
	public String adminlogin(String username,String password) {
//		Object login;
		if(username.equals("Ankita")&& password.equals("1234")) {
		return"home"; 
		
	}	return "userlogin";
	}
	

	@RequestMapping("createaccount")
	public String createaccount() {
		return "createaccount";

	}
	@RequestMapping("createaccountdata")//API
	public   <Login, login> String createaccountdata(login  Login) {
Session s=sf.openSession();
Transaction t=s.beginTransaction();
s.save(Login);//username/password
t.commit();
	return "createaccount";//page

	}



	@RequestMapping("homepage")
	public String homepage() {
		return "home";
	}

	@RequestMapping("aboutpage")
	public String aboutpage() {
		return "about";
	}

	@RequestMapping("servicepage")
	public String servicepage() {
		return "service";
	}

	@RequestMapping("contactpage")
	public String contactpage() {
		return "contact";
	}
	@RequestMapping("contactdata")//API
	public  <contact> String contactdata(contact Contact) {
Session s=sf.openSession();
Transaction t=s.beginTransaction();
s.save(Contact);//username/password
t.commit();
	return "contact";//page

	}


}