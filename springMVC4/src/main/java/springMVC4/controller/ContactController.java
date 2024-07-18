package springMVC4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springMVC4.model.User;

@Controller
public class ContactController {
//	@RequestMapping("/contact")
//	public String showForm() {
//		return "contact";
//
//	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
		m.addAttribute("Header", "Learn code");
		return "contact";

	}
	
	

//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleFrom(@RequestParam("email") String useremail, @RequestParam("name") String username,
//			@RequestParam("password") String userpassword, Model model ) {
//		User user=new User();
//		user.setEmail(useremail);
//		user.setName(username);
//		user.setPassword(userpassword);
//		System.out.println(user);
//		
//		model.addAttribute("user", user);
//		return "success";
//
//	}
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleFrom(@ModelAttribute User user, Model model) {
		model.addAttribute("Header", "Learn code");

		System.out.println(user);

		return "success";

	}

}
