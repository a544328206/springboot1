package org.microboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
//@EnableAutoConfiguration
@SpringBootApplication
public class StartSpringBootMain {
	
//	@RequestMapping("/")
//	@ResponseBody
//	public String home(){
//		return "Hello World!";
//	}
	
	public static void main(String[] args) throws Exception{
		SpringApplication.run(StartSpringBootMain.class, args);
	}

}