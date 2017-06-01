package kosta.travel.controller;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@RequestMapping("/accompany/*")
public class AccompanyController{
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(){
		return "/accompany/main";
	}
	       
	  /*    command.equals("main.accompany")
	      action = new accomp_main();
	      command.equals("accomp_createRoute.accompany")  //move to create a route page
	      action = new accomp_createRoute();*/
	       	   
}