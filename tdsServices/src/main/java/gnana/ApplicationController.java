package gnana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "gnana.dbContServ.services.interfaces")
@SpringBootApplication(scanBasePackages = {"gnana"})
public class ApplicationController {
	 public static void main(String[] args) {
	        SpringApplication.run(ApplicationController.class, args);
	        
	    }
}
