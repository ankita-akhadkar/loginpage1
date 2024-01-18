package com.ankita.TheKiranAcademy;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {


	
	@RequestMapping("loginpage")
	public String loginpage() {
		return "userlogin";
		
	}

	@RequestMapping("userlogin")
	public void String adminlogin(String username,String password) {
//		Object login;
		if(username.equals("Ankita")&& password.equals("1234")) {
		return "nextpage";
	}
	}
	

	}



}
