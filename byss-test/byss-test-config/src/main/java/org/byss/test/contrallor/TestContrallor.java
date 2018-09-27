package org.byss.test.contrallor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/config")
public class TestContrallor {
	@Value("${byss.config.profiles}")
	private String byssConfigProfiles;
	
	
	 @RequestMapping("/byssConfigProfiles")
	 public String byssConfigProfiles(){
		  return  byssConfigProfiles;
	 }
}
