package com.naz.mycart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QRScanner {

	@RequestMapping("/qrScanner")
	public String showLoginPage() {
		System.out.println("show login page");
		return "qrScanner";
	}

}
