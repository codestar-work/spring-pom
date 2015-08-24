package web;
import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {
	
	@RequestMapping("/") @ResponseBody
	String index() {
		return "Hello World!";
	}
}

