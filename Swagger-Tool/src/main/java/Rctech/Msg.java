package Rctech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Msg {

	@GetMapping("/")
	public String rc() {
		return "Welcome to Rctech";
	}
}
