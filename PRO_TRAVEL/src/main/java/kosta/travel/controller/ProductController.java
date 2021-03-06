package kosta.travel.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/product/*")
public class ProductController {
	
		@RequestMapping(value = "/register", method = RequestMethod.GET)
		public String register() {
			return "/product/register";
		}
		
		@RequestMapping(value = "/list", method = RequestMethod.GET)
		public String list() {
			return "/product/product_list";
		}
	
}
