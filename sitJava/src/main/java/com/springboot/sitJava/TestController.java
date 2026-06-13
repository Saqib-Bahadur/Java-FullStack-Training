package com.springboot.sitJava;

//import org.hibernate.boot.archive.spi.JarFileEntryUrlAdjuster;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {

	@RequestMapping("/trial")
	public String firstController() {
		return ("Just For Testing...!!");
	}
}
