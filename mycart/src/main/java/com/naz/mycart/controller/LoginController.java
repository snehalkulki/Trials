package com.naz.mycart.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.naz.mycart.model.UserLoginCrenditals;


@Controller
public class LoginController {

	@RequestMapping("/login")
	public String showLoginPage() {
		System.out.println("show login page");
		return "login";
	}
	
	@GetMapping("/validateLogin")
	public String validateLogin(@ModelAttribute("creds") UserLoginCrenditals loginCreds) {
		System.out.println(loginCreds.getUsername());
		System.out.println(loginCreds.getPassword());
		return "welcomePage";
	}
	
}
