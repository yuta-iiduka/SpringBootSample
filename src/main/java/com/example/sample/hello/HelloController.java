package com.example.sample.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@Autowired
	private HelloService service;
	
	//http://localhost8080/hello -> /templates/hello.html
	@GetMapping("/hello")
	public String getHello() {
		return "hello";
	}
	
	//http://localhost8080/hello
	@PostMapping("/hello")
	public String postRequest(@RequestParam("text1") String str, Model model) {
		//input-> name:text1 を "sample" という名前で Modelに登録
		model.addAttribute("sample",str);
		return "hello/response";
	}
	
	@PostMapping("/hello/db")
	public String postDbRequest(@RequestParam("text2")String id, Model model) {
		//1件検索
		Employee employee = service.getEmployee(id);
		//検索結果をModelに登録
		model.addAttribute("employee",employee);
		//db.htmlに画面遷移
		return "hello/db";
	}
	
}
