package com.nt.ms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/nt-ms")
public class NtMsController {
	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public String getData() {
		System.out.println("SOme called nt-ms (Server) ");
		return "Hello from NT-MS-data method (Server)";
	}
}