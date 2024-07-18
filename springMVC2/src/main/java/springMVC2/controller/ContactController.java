package springMVC2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";

	}

//	@RequestMapping(path = "/processform",method = RequestMethod.POST)
//	public String handleFrom( HttpServletRequest request)
//	{
//		String email = request.getParameter("email");
//		
//		System.out.println(email);
//		
//		return "success";
//		
//	}
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleFrom(@RequestParam("email") String useremail, @RequestParam("name") String username,
			@RequestParam("password") String userpassword, Model model ) {
		System.out.println(useremail);
		System.out.println(username);
		System.out.println(userpassword);
		model.addAttribute("email", useremail);
		model.addAttribute("name", username);
		model.addAttribute("password", userpassword);
		return "success";

	}

}
