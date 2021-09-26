package main.java.com.sachin.spring.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class SpringController {

	public SpringController() {
		super();
		System.out.println(this.getClass().getSimpleName() + " bean is created");
	}

	@RequestMapping(value = "/Registration.xworkz")
	public String onClick() {
		System.out.println("invoked click");
		return "/WEB-INF/pages/RegistrationResponse.jsp";
	}

	@RequestMapping(value = "/registration.xworkz")
	public String registration(@RequestParam String name, @RequestParam String email, @RequestParam String MobileNumber,
			@RequestParam String DOB, @RequestParam String Age, @RequestParam String gender,
			@RequestParam String AadharNumber,@RequestParam String Country,@RequestParam String State, @RequestParam String Districts, @RequestParam String pincode, Model model) {
		System.out.println("name " + name);
		System.out.println("email " + email);
		System.out.println("MobileNumber " + MobileNumber);
		System.out.println("DOB " + DOB);
		System.out.println("Age " + Age);
		System.out.println("gender " + gender);
		System.out.println("AadharNumber " + AadharNumber);
		System.out.println("Country " + Country);
		System.out.println("State " + State);
		System.out.println("Districts " + Districts);
		System.out.println("pincode " + pincode);
		
		
		model.addAttribute("username", name);
		return "/WEB-INF/views/Registration.jsp";

	}

	@RequestMapping(value = "Registration.xworkz")
	public String getregistrationpage() {
		return "/WEB-INF/views/Registration.jsp";

	}

}
