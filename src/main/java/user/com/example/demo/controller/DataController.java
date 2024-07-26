package user.com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//@RestController is used to create a RESTful web service.
public class DataController {
@GetMapping("/data")//@GetMapping("/data") maps HTTP GET requests to the getData method, which returns a simple string.
public String getData() {
	return "hello from service A!";
}
}
