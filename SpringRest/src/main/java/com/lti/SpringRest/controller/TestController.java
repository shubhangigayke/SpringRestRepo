package com.lti.SpringRest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

		@RequestMapping("/welcome")
		public String welcome() {
			return "Hi all Welcome...";
		}
}
