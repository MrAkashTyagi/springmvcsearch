package springmvcsearch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetailById(@PathVariable("userId") int userId, @PathVariable("userName") String name) {
		System.out.println(userId);
		System.out.println(name);
		Integer.parseInt(name);
		return "home";
	}

	@RequestMapping("/home")
	public String home() {
		String check = null;
		System.out.println(check.length());
		System.out.println("In home controller");
		return "home";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("queryBox") String query) {
		RedirectView redirectView = new RedirectView();
		String url = "https://www.google.com/search?q=" + query;
		redirectView.setUrl(url);
		return redirectView;

	}

	/*
	 * handling exceptions in spring mvc
	 * 
	 * @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	 * 
	 * @ExceptionHandler(NumberFormatException.class) public String
	 * exceptionHandlerNumberFormat(Model m) {
	 * m.addAttribute("msg","Number Format exception has occourd");
	 * 
	 * return "null_page"; }
	 * 
	 * @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	 * 
	 * @ExceptionHandler(NullPointerException.class) public String
	 * exceptionHandlerNull(Model m) {
	 * m.addAttribute("msg","Null Pointer exception has occourd"); return
	 * "null_page"; }
	 * 
	 * @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	 * 
	 * @ExceptionHandler(value= Exception.class) public String
	 * exceptionHandlerGeneric(Model m) {
	 * m.addAttribute("msg","Exception has occourd"); return "null_page"; }
	 */

}
