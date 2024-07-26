package user.com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//@SpringBootApplication is a convenience annotation that adds @Configuration, @EnableAutoConfiguration, and @ComponentScan
public class DemoApplication {

	public static void main(String[] args) {//The main method uses SpringApplication.run() to launch the application.
		SpringApplication.run(DemoApplication.class, args);
	}

}
