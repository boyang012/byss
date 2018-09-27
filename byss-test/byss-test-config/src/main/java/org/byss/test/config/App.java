package org.byss.test.config;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
@RequestMapping("/test/config")
@EnableEurekaClient
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
    @Value("${byss.config.profiles}")
	private String byssConfigProfiles;
	
	
	 @RequestMapping("/byssConfigProfiles")
	 public String byssConfigProfiles(){
		  return  byssConfigProfiles;
	 }
}
