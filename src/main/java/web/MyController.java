package web;
import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
	
	@RequestMapping("/")
	String index() {
		return "Hello World!";
	}
}

