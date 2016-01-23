package com.ins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Benoy Prakash
 *
 */
@Controller
class HomeController {

	/**
	 * @return
	 */
	@RequestMapping("/")
	String index() {
		return "index";
	}
}