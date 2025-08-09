package com.klu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {
	@GetMapping("/demo1")
	@ResponseBody
	public String fun1() {
		return " Sun of two numbers is 50";
	}

}
