package springmvcsearch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class MyExceptionHandler {
	
	/* handling exceptions in spring mvc */
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(NumberFormatException.class)
	public String exceptionHandlerNumberFormat(Model m) {
		m.addAttribute("msg","Number Format exception has occourd");
		
		return "null_page";
	}

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(NullPointerException.class)
	public String exceptionHandlerNull(Model m) {
		m.addAttribute("msg","Null Pointer exception has occourd");
		return "null_page";
	}
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value= Exception.class)
	public String exceptionHandlerGeneric(Model m) {
		m.addAttribute("msg","Exception has occourd");
		return "null_page";
	}
	

}
