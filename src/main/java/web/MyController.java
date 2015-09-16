package web;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
		
	@RequestMapping("/")
	String index() {
		return "Hello World!";
	}
	
}
