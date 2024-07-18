package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvcsearch.entities.User;

@Controller
public class ComplexFormController {

	@RequestMapping("/complex")
	public String viewForm() {
		System.out.println("In complext form controller");
		return "complex_form";
	}
	
	@RequestMapping(path="/handle", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute ("user") User user, BindingResult result) {
		if(result.hasErrors()) {
			
			return "complex_form";
		}
		System.out.println(user);
		return "success";
	}
	
}
